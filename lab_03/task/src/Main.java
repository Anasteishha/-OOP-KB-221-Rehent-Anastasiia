import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UserStory us1 = new UserStory(1, "User Registration", 5, null);
        UserStory us2 = new UserStory(2, "Login Feature", 3, Arrays.asList(us1));

        us1.complete();

        Bug bug1 = Bug.createBug(3, "Fix Login Button", 2, us1);
        Bug bug2 = Bug.createBug(4, "Fix Password Reset", 1, us2);

        Sprint sprint = new Sprint(10, 5);

        System.out.println(sprint.addUserStory(us1)); // true
        System.out.println(sprint.addUserStory(us2)); // false (dependency not completed)
        System.out.println(sprint.addBug(bug1)); // true
        System.out.println(sprint.addBug(bug2)); // false (user story not completed)

        us2.complete();

        System.out.println(sprint.addUserStory(us2)); // true
        System.out.println(sprint.addBug(bug2)); // true

        System.out.println("Total Estimate: " + sprint.getTotalEstimate()); // Should be 11
        System.out.println("Tickets: " + sprint.getTickets());
    }
}
