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
            System.out.print("Press any key to continue! Press N to go back to Main Menu!: ");
            choice = sc.nextLine();
        }while (!choice.equals("N"));

    }

    public void printContact(){
        if (hasmap.isEmpty())
            System.out.println("Address Book is empty! Add contact first!");
        else{
            for (String key: hasmap.keySet()){
                System.out.println(key + ":" + hasmap.get(key));
            }
        }

    }

    public void findContactByName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String inputName = sc.nextLine();
        String outputNumber = hasmap.get(inputName);
        if (outputNumber == null){
            System.out.println("Not found");
        } else {
            System.out.println(outputNumber);
        }

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

