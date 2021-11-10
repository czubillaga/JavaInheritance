import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Neil Hanlon", "PC798021", 50000.00);
    }

    @Test
    public void canRaiseSalary()  {
        databaseAdmin.raiseSalary(500.00);
        assertEquals(50500.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500, databaseAdmin.payBonus(), 0.0);
    }

    @Test
    public void willNotDecreaseSalaryWithNegativeValues() {
        databaseAdmin.raiseSalary(-100.00);
        assertEquals(50000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canSetName() {
        databaseAdmin.setName("Carlos Zubillaga");
        assertEquals("Carlos Zubillaga", databaseAdmin.getName());
    }

    @Test
    public void willNotAcceptNullValueForSetName() {
        databaseAdmin.setName(null);
        assertEquals("Neil Hanlon", databaseAdmin.getName());
    }
}
