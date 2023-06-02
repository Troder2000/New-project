import java.util.*;
public class Main {
    public static void main (String[] args) {
        System.out.println ("Hello");
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
