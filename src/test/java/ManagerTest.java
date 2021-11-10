import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Neil Hanlon", "PC798021", 50000.00, "Chicken Fraud");
    }

    @Test
    public void canRaiseSalary()  {
        manager.raiseSalary(500.00);
        assertEquals(50500.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500, manager.payBonus(), 0.0);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Chicken Fraud", manager.getDeptName());
    }

    @Test
    public void willNotDecreaseSalaryWithNegativeValues() {
        manager.raiseSalary(-100.00);
        assertEquals(50000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canSetName() {
        manager.setName("Carlos Zubillaga");
        assertEquals("Carlos Zubillaga", manager.getName());
    }

    @Test
    public void willNotAcceptNullValueForSetName() {
        manager.setName(null);
        assertEquals("Neil Hanlon", manager.getName());
    }
}
