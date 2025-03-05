import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void readFileTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("readFile", cArg);
  // Enter code here
  try {
    assertEquals("Hello\nWorld", (String)method.invoke(null, "file2.txt"));
    
  } catch (Exception e) {
    fail(e.getMessage());  // Noncompliant
  }
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void backwardsReadFileTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("backwardsReadFile", cArg);
  // Enter code here
  try {
    assertEquals("dlroW olleH", (String)method.invoke(null, "file.txt"));
    
  } catch (Exception e) {
    fail(e.getMessage());  // Noncompliant
  }
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void backwardsReadFileTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("backwardsReadFile", cArg);
  // Enter code here
  try {
      assertEquals("654321", (String)method.invoke(null, "file1.txt"));
    
  } catch (Exception e) {
    fail(e.getMessage());  // Noncompliant
  }
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void backwardsReadFileTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("backwardsReadFile", cArg);
  // Enter code here
  try {
      assertEquals("dlroW\nolleH", (String)method.invoke(null, "file2.txt"));
  } catch (Exception e) {
    fail(e.getMessage());  // Noncompliant
  }
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void readFileTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("readFile", cArg);
  // Enter code here
  try {
    
    assertEquals("123456", (String)method.invoke(null, "file1.txt"));
  } catch (Exception e) {
    fail(e.getMessage());  // Noncompliant
  }
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void readFileTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String.class};
        Method method = testClass.getDeclaredMethod("readFile", cArg);
  // Enter code here
  try {
    
    assertEquals("Hello World", (String)method.invoke(null, "file.txt"));
  } catch (Exception e) {
    fail(e.getMessage());  // Noncompliant
  }
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
