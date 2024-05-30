import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sprint {
    private int capacity;
    private int ticketLimit;
    private List<Ticket> tickets;

    public Sprint(int capacity, int ticketLimit) {
        this.capacity = capacity;
        this.ticketLimit = ticketLimit;
        this.tickets = new ArrayList<>();
    }

    public boolean addUserStory(UserStory userStory) {
        return addTicket(userStory);
    }

    public boolean addBug(Bug bug) {
        return addTicket(bug);
    }

    private boolean addTicket(Ticket ticket) {
        if (ticket == null || ticket.isCompleted()) {
            return false;
        }

        int totalEstimate = getTotalEstimate();
        if (totalEstimate + ticket.getEstimate() > capacity || tickets.size() >= ticketLimit) {
            return false;
        }

        tickets.add(ticket);
        return true;
    }

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(tickets);
    }

    public int getTotalEstimate() {
        int total = 0;
        for (Ticket ticket : tickets) {
            total += ticket.getEstimate();
        }
        return total;
    }
}
