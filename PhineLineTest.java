import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class PhoneLineTest {
PhoneLine p;
@BeforeEach
void setUp() throws Exception {
p = new PhoneLine();
}
@AfterEach
void tearDown() throws Exception {
p = null;
}

@Test
public void TestCase1() {
    assertEquals(p.offHook(), "soundDialTone");
}

@Test
public void TestCase2() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase3() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase4() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.validNumber(), "findConnection");
}

@Test
public void TestCase5() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(100); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "findConnection");
}

@Test
public void TestCase6() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(200); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "findConnection");
}

@Test
public void TestCase7() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.validNumber(), "findConnection");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase8() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.validNumber(), "findConnection");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase9() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.validNumber(), "findConnection");
    assertEquals(p.validNumber(), "continues");
}

@Test
public void TestCase10() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.validNumber(), "findConnection");
    assertEquals(p.validNumber(), "continues");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase11() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.validNumber(), "findConnection");
    assertEquals(p.validNumber(), "continues");
    assertEquals(p.validNumber(), "continues");
}

@Test
public void TestCase12() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.validNumber(), "findConnection");
    assertEquals(p.invalidNumber(), "continues");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase13() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.validNumber(), "findConnection");
    assertEquals(p.invalidNumber(), "continues");
    assertEquals(p.validNumber(), "continues");
}

@Test
public void TestCase14() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.validNumber(), "findConnection");
    try {Thread.sleep(100); } catch (Exception ex) {}
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase15() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.validNumber(), "findConnection");
    try {Thread.sleep(100); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "continues");
}

@Test
public void TestCase16() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.validNumber(), "findConnection");
    try {Thread.sleep(200); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "continues");
}

@Test
public void TestCase17() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.invalidNumber(), "PlayMessage");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase18() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.invalidNumber(), "PlayMessage");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase19() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.invalidNumber(), "PlayMessage");
    assertEquals(p.validNumber(), "slowBusyTone");
}

@Test
public void TestCase20() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.invalidNumber(), "PlayMessage");
    assertEquals(p.validNumber(), "slowBusyTone");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase21() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.invalidNumber(), "PlayMessage");
    assertEquals(p.validNumber(), "slowBusyTone");
    assertEquals(p.validNumber(), "slowBusyTone");
}

@Test
public void TestCase22() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.invalidNumber(), "PlayMessage");
    assertEquals(p.invalidNumber(), "slowBusyTone");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase23() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.invalidNumber(), "PlayMessage");
    assertEquals(p.invalidNumber(), "slowBusyTone");
    assertEquals(p.validNumber(), "slowBusyTone");
}

@Test
public void TestCase24() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.invalidNumber(), "PlayMessage");
    try {Thread.sleep(100); } catch (Exception ex) {}
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase25() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.invalidNumber(), "PlayMessage");
    try {Thread.sleep(100); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "slowBusyTone");
}

@Test
public void TestCase26() {
    assertEquals(p.offHook(), "soundDialTone");
    assertEquals(p.invalidNumber(), "PlayMessage");
    try {Thread.sleep(200); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "slowBusyTone");
}

@Test
public void TestCase27() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(100); } catch (Exception ex) {}
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase28() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(100); } catch (Exception ex) {}
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase29() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(100); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "findConnection");
}

@Test
public void TestCase30() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(200); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "findConnection");
}

@Test
public void TestCase31() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(300); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "findConnection");
}

@Test
public void TestCase32() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(100); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "findConnection");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase33() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(100); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "findConnection");
    assertEquals(p.validNumber(), "continues");
}

@Test
public void TestCase34() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(100); } catch (Exception ex) {}
    assertEquals(p.invalidNumber(), "PlayMessage");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase35() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(100); } catch (Exception ex) {}
    assertEquals(p.invalidNumber(), "PlayMessage");
    assertEquals(p.validNumber(), "slowBusyTone");
}

@Test
public void TestCase36() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(200); } catch (Exception ex) {}
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase37() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(200); } catch (Exception ex) {}
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase38() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(200); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "findConnection");
}

@Test
public void TestCase39() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(300); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "findConnection");
}

@Test
public void TestCase40() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(400); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "findConnection");
}

@Test
public void TestCase41() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(200); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "findConnection");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase42() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(200); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "findConnection");
    assertEquals(p.validNumber(), "continues");
}

@Test
public void TestCase43() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(200); } catch (Exception ex) {}
    assertEquals(p.invalidNumber(), "PlayMessage");
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase44() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(200); } catch (Exception ex) {}
    assertEquals(p.invalidNumber(), "PlayMessage");
    assertEquals(p.validNumber(), "slowBusyTone");
}

@Test
public void TestCase45() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(300); } catch (Exception ex) {}
    assertEquals(p.onHook(), "disconnectedLine");
}

@Test
public void TestCase46() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(300); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "slowBusyTone");
}

@Test
public void TestCase47() {
    assertEquals(p.offHook(), "soundDialTone");
    try {Thread.sleep(400); } catch (Exception ex) {}
    assertEquals(p.validNumber(), "slowBusyTone");
}

}
