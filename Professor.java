/**
 * Class representing a Professor.
 *
 * @author Emma Lee, Walter Chu
 */
public class Professor extends Employee implements Comparable<Professor>
{
    protected final String teachingMajor;
    
    private static final String  DRESS_CODE                        = "fancy";
    private static final boolean IS_PAID_SALARY                    = true;
    private static final boolean POST_SECONDARY_EDUCATION_REQUIRED = true;
    private static final String  WORK_VERB                         = "teach";
    private static final double  OVER_TIME_PAY_RATE                = 2.0;
    private static final int     HIGHER_RANK                       = -1;
    private static final int     LOWER_RANK                        = 1;
    private static final int     EQUAL_RANK                        = 0;

    /**
     * Constructs a Professor with the given name and teaching major.
     *
     * @param name the name of the professor.
     * @param teachingMajor the teaching major of the professor.
     */
    public Professor(final String name,
                     final String teachingMajor)
    {
        super(name);

        this.teachingMajor = teachingMajor;
    }


    /**
     * Gets the dress code of the professor.
     */
    @Override
    public String getDressCode()
    {
        return DRESS_CODE;
    }

    /**
     * Gets whether the professor is paid or not.
     */
    @Override
    public boolean isPaidSalary()
    {
        return IS_PAID_SALARY;
    }

    /**
     * Gets whether the professor requires post-secondary education or not.
     */
    @Override
    public boolean postSecondaryEducationRequired()
    {
        return POST_SECONDARY_EDUCATION_REQUIRED;
    }

    /**
     * Gets the type of work that the professor does.
     */
    @Override
    public String getWorkVerb()
    {
        return WORK_VERB;
    }

    /**
     * Gets the overtime pay rate of the professor.
     */
    @Override
    public double getOverTimePayRate()
    {
        return OVER_TIME_PAY_RATE;
    }

    /**
     * Compares this Professor with another based on the teaching major.
     *
     * @param other the other Professor to compare to.
     * @return a negative integer, zero, or a positive integer in terms of teaching major.
     */
    @Override
    public int compareTo(final Professor other)
    {
        if (this.teachingMajor.equals("Computer Systems") && !other.teachingMajor.equals("Computer Systems"))
        {
            return HIGHER_RANK;
        }
        else if (!this.teachingMajor.equals("Computer Systems") && other.teachingMajor.equals("Computer Systems"))
        {
            return LOWER_RANK;
        }
        else
        {
            return EQUAL_RANK;
        }
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
        Professor that = (Professor) obj;

        return teachingMajor.equals(that.teachingMajor);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode()
    {
        return teachingMajor.hashCode();
    }
}
