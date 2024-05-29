/**
 * Interface representing an employable entity.
 *
 * @author Emma Lee, Walter Chu
 * @version 2024
 */
public interface Employable
{
    /**
     * Returns the dress code required for the employable entity.
     *
     * @return the dress code as a String.
     */
    public String getDressCode();

    /**
     * Checks if the employable entity is paid a salary.
     *
     * @return true if the entity is paid a salary, false otherwise.
     */
    public boolean isPaidSalary();

    /**
     * Checks if post-secondary education is required for the employable entity.
     *
     * @return true if post-secondary education is required, false otherwise.
     */
    public boolean postSecondaryEducationRequired();

    /**
     * Returns the main verb describing the work of the employable entity.
     *
     * @return the work verb as a String.
     */
    public String getWorkVerb();

    /**
     * Indicates if the employable entity gets paid.
     *
     * @return true if the entity gets paid, false otherwise.
     */
    default public boolean getsPaid()
    {
        return true;
    }
}
