/**
 * Class representing a Hockey Player.
 *
 * @author Emma Lee, Walter Chu
 * @version 2024
 */
public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer>
{
    protected final int numberOfGoals;

    private static final String  DRESS_CODE                        = "jersey";
    private static final boolean IS_PAID_SALARY                    = true;
    private static final boolean POST_SECONDARY_EDUCATION_REQUIRED = false;
    private static final String  WORK_VERB                         = "play";
    private static final double  OVER_TIME_PAY_RATE                = 0.0;

    /**
     * Constructs a HockeyPlayer with the given name and number of goals.
     *
     * @param name the name of the hockey player.
     * @param numberOfGoals the number of goals scored by the hockey player.
     */
    public HockeyPlayer(final String name,
                        final int numberOfGoals)
    {
        super(name);
        this.numberOfGoals = numberOfGoals;
    }

    /**
     * Gets the dress code of the hockey player.
     */
    @Override
    public String getDressCode()
    {
        return DRESS_CODE;
    }

    /**
     * Determines whether the hockey player is paid or not.
     */
    @Override
    public boolean isPaidSalary()
    {
        return IS_PAID_SALARY;
    }

    /**
     * Determines whether the hockey player needs post secondary education.
     */
    @Override
    public boolean postSecondaryEducationRequired()
    {
        return POST_SECONDARY_EDUCATION_REQUIRED;
    }

    /**
     * Determines the work that the hockey player does.
     */
    @Override
    public String getWorkVerb()
    {
        return WORK_VERB;
    }

    /**
     * Gets the over time pay rate of the hockey player.
     */
    @Override
    public double getOverTimePayRate()
    {
        return OVER_TIME_PAY_RATE;
    }

    /**
     * Compares this HockeyPlayer with another based on the number of goals scored.
     *
     * @param other the other HockeyPlayer to compare to.
     * @return a negative integer, zero, or a positive integer depending on goals scored.
     */
    @Override
    public int compareTo(final HockeyPlayer other)
    {
        return Integer.compare(this.numberOfGoals, other.numberOfGoals);
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
        HockeyPlayer that = (HockeyPlayer) obj;

        return numberOfGoals == that.numberOfGoals;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode()
    {
        return Integer.hashCode(numberOfGoals);
    }
}
