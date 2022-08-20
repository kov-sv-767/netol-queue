public class Person {
    private String name;
    private String surname;
    private int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public int checkTickets() {
        if (tickets > 0) {
            tickets--;
        }
        return tickets;
    }

    @Override
    public String toString() {
        if (tickets == 1) {
            return "Клиент " + name + " " + surname + ", " + tickets + " билет";
        } else if (tickets > 1 && tickets < 5) {
            return "Клиент " + name + " " + surname + ", " + tickets + " билета";
        } else {
            return "Клиент " + name + " " + surname + ", " + tickets + " билетов";
        }
    }
}