/**
 * Abstract class representing an Employee.
 *
 * @author Emma Lee, Walter Chu
 * @version 2024
 */
public abstract class Employee implements Employable
{
    /**
     * The name of the employee.
     */
    protected final String name;

    /**
     * Constructs an Employee with the given name.
     *
     * @param name the name of the employee.
     */
    public Employee(final String name)
    {
        this.name = name;
    }

    /**
     * Returns the overtime pay rate for the employee.
     *
     * @return the overtime pay rate as a double.
     */
    public abstract double getOverTimePayRate();
}
