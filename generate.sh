#!/bin/bash

# Проверяем количество аргументов
if [ $# -ne 2 ]; then
    echo "Использование: $0 <файл_с_тестами> <имя_объекта>"
    exit 1
fi

input_file="$1"
object_name="$2"
test_case_num=1

# Проверяем существование файла
if [ ! -f "$input_file" ]; then
    echo "Файл '$input_file' не найден"
    exit 1
fi

# Читаем файл построчно
while IFS= read -r line || [ -n "$line" ]; do
    # Пропускаем пустые строки
    if [ -z "$line" ]; then
        continue
    fi
    
    # Выводим преамбулу теста
    echo "@Test"
    echo "public void TestCase${test_case_num}() {"
    
    # Разбиваем строку на записи
    IFS=' ' read -ra entries <<< "$line"
    
    # Обрабатываем последовательные tick/tick
    tick_count=0
    
    for entry in "${entries[@]}"; do
        if [ "$entry" = "tick/tick" ]; then
            ((tick_count++))
        else
            # Если были тики перед этим, выводим sleep
            if [ $tick_count -gt 0 ]; then
                echo "    try {Thread.sleep($((tick_count * 100 + 1))); } catch (Exception ex) {}"
                tick_count=0
            fi
            
            # Разбиваем запись на метод и ожидаемое значение
            IFS='/' read -r method expected <<< "$entry"
            
            # Пропускаем если expected = null
            if [ "$expected" = "null" ]; then
                continue
            fi
            
            # Выводим assertion
            echo "    assertEquals(${object_name}.${method}(), \"${expected}\");"
        fi
    done
    
    # Если строка закончилась тиками, выводим sleep
    if [ $tick_count -gt 0 ]; then
        echo "    try {Thread.sleep($((tick_count * 100))); } catch (Exception ex) {}"
    fi
    
    # Завершаем тест
    echo "}"
    echo ""
    
    ((test_case_num++))
    
done < "$input_file"
