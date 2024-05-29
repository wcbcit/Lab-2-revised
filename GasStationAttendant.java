/**
 * Class representing a Gas Station Attendant.
 *
 * @author Emma Lee, Walter Chu
 * @version 2024
 */
public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant>
{
    protected final double numberOfDollarsStolenPerDay;

    private static final String  DRESS_CODE                        = "uniform";
    private static final boolean IS_PAID_SALARY                    = false;
    private static final boolean POST_SECONDARY_EDUCATION_REQUIRED = false;
    private static final String  WORK_VERB                         = "pump";
    private static final double  OVER_TIME_PAY_RATE                = 1.5;

    /**
     * Constructs a GasStationAttendant with the given name and amount of money stolen per day.
     *
     * @param name the name of the gas station attendant.
     * @param numberOfDollarsStolenPerDay the amount of money stolen per day.
     */
    public GasStationAttendant(final String name,
                               final double numberOfDollarsStolenPerDay)
    {
        super(name);

        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }

    /**
     * Gets the dress code of the gas station attendant.
     */
    @Override
    public String getDressCode()
    {
        return DRESS_CODE;
    }

    /**
     * Indicates whether the gas station attendant is paid or not.
     */
    @Override
    public boolean isPaidSalary()
    {
        return IS_PAID_SALARY;
    }

    /**
     * Indicates whether the gas station attendant requires post-secondary education. .
     */
    @Override
    public boolean postSecondaryEducationRequired()
    {
        return POST_SECONDARY_EDUCATION_REQUIRED;
    }

    /**
     * Indicates the work that the gas attendant does.
     */
    @Override
    public String getWorkVerb()
    {
        return WORK_VERB;
    }

    /**
     * Gets the over time pay rate of the gas station attendant.
     */
    @Override
    public double getOverTimePayRate()
    {
        return OVER_TIME_PAY_RATE;
    }

    /**
     * Compares this GasStationAttendant with another based on the amount of money stolen per day.
     *
     * @param other the other GasStationAttendant to compare to.
     * @return a negative integer, zero, or a positive integer as specified by GasStationAttendant.
     */
    @Override
    public int compareTo(final GasStationAttendant other)
    {
        return Double.compare(this.numberOfDollarsStolenPerDay, other.numberOfDollarsStolenPerDay);
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

        GasStationAttendant that = (GasStationAttendant) obj;

        return Double.compare(that.numberOfDollarsStolenPerDay, numberOfDollarsStolenPerDay) == 0;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode()
    {
        return Double.hashCode(numberOfDollarsStolenPerDay);
    }
}
