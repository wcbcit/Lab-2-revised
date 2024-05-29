/**
 * Class representing a Parent.
 *
 * @author Emma Lee, Walter Chu
 */
public class Parent extends Employee implements Comparable<Parent>
{
    protected final int weeklyHoursWithKids;

    private static final String  DRESS_CODE                        = "anything";
    private static final boolean IS_PAID_SALARY                    = false;
    private static final boolean POST_SECONDARY_EDUCATION_REQUIRED = false;
    private static final String  WORK_VERB                         = "care";
    private static final double  OVER_TIME_PAY_RATE                = -2.0;
    private static final boolean GETS_PAID                         = false;

    /**
     * Constructs a Parent with the given name and weekly hours spent with kids.
     *
     * @param name the name of the parent.
     * @param weeklyHoursWithKids the number of hours the parent spends with kids weekly.
     */
    public Parent(final String name,
                  final int weeklyHoursWithKids)
    {
        super(name);

        this.weeklyHoursWithKids = weeklyHoursWithKids;
    }

    @Override
    public String getDressCode()
    {
        return DRESS_CODE;
    }

    @Override
    public boolean isPaidSalary()
    {
        return IS_PAID_SALARY;
    }

    @Override
    public boolean postSecondaryEducationRequired()
    {
        return POST_SECONDARY_EDUCATION_REQUIRED;
    }

    @Override
    public String getWorkVerb()
    {
        return WORK_VERB;
    }

    @Override
    public double getOverTimePayRate()
    {
        return OVER_TIME_PAY_RATE;
    }

    /**
     * Checks if the parent gets paid.
     *
     * @return false as parents do not get paid.
     */
    @Override
    public boolean getsPaid()
    {
        return GETS_PAID;
    }

    /**
     * Compares this Parent with another based on the number of weekly hours spent with kids.
     *
     * @param other the other Parent to compare to.
     * @return a negative integer, zero, or a positive integer depending on weekly hours with kids.
     */
    @Override
    public int compareTo(final Parent other)
    {
        return Integer.compare(this.weeklyHoursWithKids, other.weeklyHoursWithKids);
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Parent that = (Parent) obj;

        return weeklyHoursWithKids == that.weeklyHoursWithKids;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode()
    {
        return Integer.hashCode(weeklyHoursWithKids);
    }
}
