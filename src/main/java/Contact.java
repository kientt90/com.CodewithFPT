import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Contact {
    private String name;
    private String phoneNumber;

    HashMap<String,String> hasmap = new HashMap<String,String>();
    String choice;
    public void addContact(){
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Name: ");
            setName(sc.nextLine());
            System.out.print("Phone Number: ");
            setPhoneNumber(sc.nextLine());
            hasmap.put(getName(),getPhoneNumber());
            System.out.print("Press any to continue! Press N to stop");
            choice = sc.nextLine();
        }while (!choice.equals("N"));

    }

    public void printContact(){
        for (String key: hasmap.keySet()){
            System.out.println(key + ":" + hasmap.get(key));
        }
    }

    public void findContactByName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        System.out.println(hasmap.get(sc.nextLine()));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

