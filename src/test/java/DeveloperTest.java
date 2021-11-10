import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Neil Hanlon",  "PC798021", 50000.00);
    }

    @Test
    public void canRaiseSalary()  {
        developer.raiseSalary(500.00);
        assertEquals(50500.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500, developer.payBonus(), 0.0);
    }

    @Test
    public void willNotDecreaseSalaryWithNegativeValues() {
        developer.raiseSalary(-100.00);
        assertEquals(50000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canSetName() {
        developer.setName("Carlos Zubillaga");
        assertEquals("Carlos Zubillaga", developer.getName());
    }

    @Test
    public void willNotAcceptNullValueForSetName() {
        developer.setName(null);
        assertEquals("Neil Hanlon", developer.getName());
    }
}
