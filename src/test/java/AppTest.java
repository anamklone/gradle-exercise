/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

//import App;

public class AppTest {
    @Test
    public void testAppHasTri() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.Tri(5));
        assertEquals(15,classUnderTest.Tri(5));
    }

    @Test
    public void triangleTest9() {
      assertEquals(45, App.Tri(9));
    }

    @Test
    public void triangleTest15() {
      assertEquals(120, App.Tri(15));
    }
}
