
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentPortalTest {

    StudentPortal app = new StudentPortal();

    @Test
    public void testStatus() {

        assertEquals(
                "APPLICATION RUNNING",
                app.getStatus());

    }
}
