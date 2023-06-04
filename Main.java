import java.util.*;
// Arsh Bansal comment
// Mihir Motukuri comment
public class Main {
    public static void main (String[] args) {
        HashMap<String, String> questions = new HashMap<String, String>();
        questions.put("Yeho Department", "");

        Scanner console = new Scanner(System.in);
        System.out.println("Hello! We at Bofa's All-Purpose Store have reviewed your application, and are pleased to offer you a position as a Sales Associate. Now that you are one of us, what should we call you?");
        String name = console.nextLine();
        while (name.length() > 8 || name.length() < 2) {
            if (name.length() > 8) {
                System.out.print("Inputted name is too long. ");
            }
            else if (name.length() < 2) {
                System.out.print("Inputted name is too short. ");
            }
            System.out.println("Please enter a name of length 2-8 characters.");
            name = console.nextLine();
        }
        System.out.println("Ah, " + name + "! Let's stop wasting time, time to prove your skills. You will be in charge of helping customers find items in our store. Here are our departments:");
        System.out.println("\nFood department (f)\nTechnology department (t)\nAlcohol department (a)\nBooks department (b)\nMedical department (m)\nClothing department (c)\n");
        System.out.println("To direct a customer to a department, press its corresponding key as shown above.");

        boolean end = false;
        while (!end) {
            

        }

        console.close();
    }
    //where should i put this
    public static void selectDepartment()
    {
        Scanner myObj = new Scanner(System.in); 
        System.out.println(" 0. ??? Department /t 7. Books Department /n 1. Meat Department /t 8. Health and Beauty Department /n 2. Seafood Department /t 9. Decorations Department /n 3. ");
        System.out.println("Enter number for Department:");
    
        int input = myObj.nextInt(); 
        String department = " ";
        switch (input)
        {
            case 0:
                department = "Yeho Department";
                break;
            case 1:
                department = "Meat Department";
                break;
            case 2:
                department = "Seafood Department";
                break;
            case 3:
                department = "Fruit Department";
                break; 
            case 4:
                department = "Snack Department";
                break; 
            case 5:
                department = "Wine and Beer Department";
                break;
            case 6:
                department = "Medical Department";
                break;
            case 7:
                department = "Books Department";
                break;
            case 8:
                department = "Health and Beauty Department";
                break;
            case 9:
                department = "Decorations Department";
                break;
            case 10:
                department = "Clothing Department";
                break;
            case 11:
                department = "Technology Department";
                break;
            case 12:
                department = "Film Department";
                break;
            default:
                System.out.println("YOU ARE FIRED!!!");
                break;
        }
    }
    
}
