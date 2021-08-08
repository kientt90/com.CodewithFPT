import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Contact ct = new Contact();
        byte choice;
        do {
            MainMenu();
            Scanner sc = new Scanner(System.in);
            System.out.print("Pls choose: ");
            choice = sc.nextByte();

            switch (choice) {
                case 1:
                    ct.addContact();
                    break;
                case 2:
                    ct.findContactByName();
                    break;
                case 3:
                    ct.printContact();
                    break;
                default:
                    System.out.println("Bye");
            }

        }while (choice != 4) ;
    }

    public static void MainMenu() {
        System.out.println("Address Book");
        System.out.println("------------");
        System.out.println("1.Add new contact.");
        System.out.println("2.Find a contact by name.");
        System.out.println("3.Display contacts.");
        System.out.println("4.Exit!");
    }
}

