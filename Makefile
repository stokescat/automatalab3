JUNIT_JAR = junit-platform-console-standalone-1.9.3.jar
JUNIT_URL = https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.3/$(JUNIT_JAR)
SRC = *.java
CLASSES = $(SRC:.java=.class)
TEST_CLASS = PhoneLineTest

# Цели по умолчанию
.PHONY: all compile test clean download-junit help

# Основная цель
all: compile test

# Помощь
help:
	@echo "Доступные команды:"
	@echo "  make all        - компиляция и запуск тестов"
	@echo "  make compile    - только компиляция"
	@echo "  make test       - запуск тестов"
	@echo "  make clean      - удаление скомпилированных файлов"
	@echo "  make download-junit - скачать JUnit JAR"
	@echo "  make help       - показать эту справку"

# Скачать JUnit если нет
download-junit:
	@if [ ! -f "$(JUNIT_JAR)" ]; then \
		echo "Скачивание JUnit..."; \
		wget $(JUNIT_URL) || curl -L -o $(JUNIT_JAR) $(JUNIT_URL); \
	else \
		echo "JUnit уже скачан"; \
	fi

# Компиляция
compile: download-junit
	@echo "Компиляция Java файлов..."
	@javac -cp "$(JUNIT_JAR):." $(SRC) || (echo "Ошибка компиляции. Проверьте наличие Java компилятора." && exit 1)
	@echo "Компиляция завершена успешно!"

# Запуск тестов
test: compile
	@echo "Запуск тестов..."
	@java -jar $(JUNIT_JAR) --class-path . --select-class $(TEST_CLASS) --disable-banner --details tree

# Запуск одного конкретного теста
test-single: compile
	@echo "Запуск теста TestCase$(TEST_NUM)..."
	@java -jar $(JUNIT_JAR) --class-path . --select-method $(TEST_CLASS)#TestCase$(TEST_NUM) --disable-banner

# Запуск GUI-примера
run-gui: compile
	@echo "Запуск GUI примера..."
	@java -cp . PhoneLineSample

# Очистка
clean:
	@echo "Очистка скомпилированных файлов..."
	@rm -f *.class
	@echo "Очистка завершена!"

# Полная очистка
distclean: clean
	@echo "Полная очистка..."
	@rm -f $(JUNIT_JAR)
	@echo "Полная очистка завершена!"

# Создание JAR-файла
jar: compile
	@echo "Создание JAR-файла..."
	@jar cfe PhoneLine.jar PhoneLineSample *.class
	@echo "JAR-файл создан: PhoneLine.jar"

# Быстрая проверка Java
check-java:
	@echo "Проверка установки Java..."
	@java -version
	@javac -version
	@echo "Java проверена успешно!"
