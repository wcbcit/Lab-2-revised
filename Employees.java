import java.util.*;

/**
 * Class representing a collection of Employees.
 *
 * @author Emma Lee, Walter Chu
 * @version 2024
 */
public class Employees
{
    private final List<HockeyPlayer>        hockeyPlayers;
    private final List<Professor>           professors;
    private final List<Parent>              parents;
    private final List<GasStationAttendant> gasStationAttendants;

    private static final int INITIAL_VALUE = 0;
    private static final int ADD_VALUE     = 1;

    /**
     * Constructs an Employees object and initializes the employee lists.
     */
    public Employees()
    {
        hockeyPlayers        = new ArrayList<>();
        professors           = new ArrayList<>();
        parents              = new ArrayList<>();
        gasStationAttendants = new ArrayList<>();

        hockeyPlayers.add(new HockeyPlayer("Wayne Gretzky", 894));
        hockeyPlayers.add(new HockeyPlayer("Who Ever", 0));
        hockeyPlayers.add(new HockeyPlayer("Brent Gretzky", 1));
        hockeyPlayers.add(new HockeyPlayer("Pavel Bure", 437));
        hockeyPlayers.add(new HockeyPlayer("Jason Wilder", 0));

        professors.add(new Professor("Albert Einstein", "Physics"));
        professors.add(new Professor("Jason Wilder", "Computer Systems"));
        professors.add(new Professor("Richard Feynman", "Physics"));
        professors.add(new Professor("BCIT Instructor", "Computer Systems"));
        professors.add(new Professor("Kurt Godel", "Logic"));

        parents.add(new Parent("Tiger Woods", 1));
        parents.add(new Parent("Super Mom", 168));
        parents.add(new Parent("Lazy Larry", 20));
        parents.add(new Parent("Ex Hausted", 168));
        parents.add(new Parent("Super Dad", 167));

        gasStationAttendants.add(new GasStationAttendant("Joe Smith", 10));
        gasStationAttendants.add(new GasStationAttendant("Tony Baloney", 100));
        gasStationAttendants.add(new GasStationAttendant("Benjamin Franklin", 100));
        gasStationAttendants.add(new GasStationAttendant("Mary Fairy", 101));
        gasStationAttendants.add(new GasStationAttendant("Bee See", 1));
    }

    /**
     * Displays and sorts the employee lists.
     */
    public void displayAndSortEmployees()
    {
        System.out.println("Before sorting:");
        displayEmployees();

        Collections.sort(hockeyPlayers);
        Collections.sort(professors);
        Collections.sort(parents);
        Collections.sort(gasStationAttendants);

        System.out.println("\nAfter sorting:");
        displayEmployees();
    }

    /**
     * Displays the employees in the lists.
     */
    private void displayEmployees()
    {
        System.out.println("HockeyPlayers:");
        for (final HockeyPlayer player : hockeyPlayers)
        {
            System.out.println(player.name + " scored " + player.numberOfGoals + " goals");
        }

        System.out.println("Professors:");
        for (final Professor professor : professors)
        {
            System.out.println(professor.name + " teaches " + professor.teachingMajor);
        }

        System.out.println("Parents:");
        for (final Parent parent : parents)
        {
            System.out.println(parent.name + " spends " + parent.weeklyHoursWithKids + " hours/week with kids");
        }

        System.out.println("GasStationAttendants:");
        for (final GasStationAttendant attendant : gasStationAttendants)
        {
            System.out.println(attendant.name + " steals " + attendant.numberOfDollarsStolenPerDay + " dollars/day");
        }
    }

    /**
     * Displays all employees that are equal to one another.
     */
    public void displayEqualEmployees()
    {
        System.out.println("\nEqual employees:");

        printEqualEmployees(hockeyPlayers);
        printEqualEmployees(professors);
        printEqualEmployees(parents);
        printEqualEmployees(gasStationAttendants);
    }

    /**
     * Prints equal employees from the given list.
     *
     * @param list the list of employees to check for equality.
     * @param <T> the type of employees in the list.
     */
    private <T> void printEqualEmployees(final List<T> list)
    {
        for (int i = INITIAL_VALUE ; i < list.size(); i++)
        {
            for (int j = i + ADD_VALUE; j < list.size(); j++)
            {
                if (list.get(i).equals(list.get(j)))
                {
                    System.out.println(list.get(i) + " and " + list.get(j) + " are equal.");
                }
            }
        }
    }

    /**
     * The main method that runs the Employees class.
     *
     * @param args the command line arguments.
     */
    public static void main(final String[] args)
    {
        final Employees employees;

        employees = new Employees();
        employees.displayAndSortEmployees();
        employees.displayEqualEmployees();
    }
}
