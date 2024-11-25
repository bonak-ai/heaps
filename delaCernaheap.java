import java.util.PriorityQueue;
import java.util.Scanner;

class Person implements Comparable<Person> {
    String name;
    int age;
    String birthday;
    String relationshipStatus;

    public Person(String name, int age, String birthday, String relationshipStatus) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.relationshipStatus = relationshipStatus;
    }

    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Birthday: " + birthday + ", Relationship Status: " + relationshipStatus;
    }
}

public class delaCernaheap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Person> personQueue = new PriorityQueue<>();

        while (true) {
    System.out.println("Enter '1' to add a" + 
           " person, '2' to display all persons, " + 
           "or '3' to exit:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Exiting the application.");
                break;
            } else if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter birthday : ");
                String birthday = scanner.nextLine();
                System.out.print("Enter relationship status: ");
                String relationshipStatus = scanner.nextLine();
                personQueue.add(new Person(name, age, birthday, relationshipStatus));
                System.out.println("Person added successfully.");
            } else if (choice == 2) {
                if (personQueue.isEmpty()) {
                    System.out.println("No persons in the queue.");
                } else {
                    System.out.println("Persons in the queue (sorted by age):");
                    for (Person person : personQueue) {
                        System.out.println(person);
                    }
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

