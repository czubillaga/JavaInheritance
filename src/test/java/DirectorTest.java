import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Neil Hanlon", "PC798021", 50000.00, "Chicken Fraud", 10000000);
    }

    @Test
    public void canRaiseSalary()  {
        director.raiseSalary(500.00);
        assertEquals(50500.00, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000, director.payBonus(), 0.0);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Chicken Fraud", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(10000000, director.getBudget(), 0.0);
    }

    @Test
    public void willNotDecreaseSalaryWithNegativeValues() {
        director.raiseSalary(-100.00);
        assertEquals(50000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canSetName() {
        director.setName("Carlos Zubillaga");
        assertEquals("Carlos Zubillaga", director.getName());
    }

    @Test
    public void willNotAcceptNullValueForSetName() {
        director.setName(null);
        assertEquals("Neil Hanlon", director.getName());
    }

    @Test
    public void directorGetsHigherBonus() {
        assertEquals(1000, director.payBonus(), 0.0);
    }
}
