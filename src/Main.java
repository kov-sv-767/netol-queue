import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Person> clients = new ArrayDeque<>(generateClients());
        for (Person p : clients) {
            System.out.println(p);
        }
        while (!clients.isEmpty()) {
            Person p = clients.poll();
            System.out.println(p + " прокатился на атракионе.");
            System.out.println("Осталось " + p.checkTickets() + " билетов");
            if (p.checkTickets() > 0) {
                clients.offerLast(p);
            }
        }
    }

    static List<Person> generateClients() {
        List<Person> client = new LinkedList<>();
        client.add(new Person("Mark", "Colner", 5)); //5
        client.add(new Person("Anny", "Tarket", 2)); //2
        client.add(new Person("John", "Miller", 7)); //7
        client.add(new Person("Tom", "Jackson", 4)); //4
        client.add(new Person("Nancy", "Kellet", 1)); //1
        return client;
    }
}
