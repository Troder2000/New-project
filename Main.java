import java.util.*;
public class Main {
    public static void main (String[] args) {
        HashMap<String, String[]> questions = new HashMap<String, String[]>();
        questions.put("Food Department", new String[]{"OH BOY! ITS A ME, PIZZA BOY! HOT! DO YOU GOT A 'ZA FOR ME! I'M GETTING HUNGRY LOOKIN AT CHA, BUD! I don't get paid enough for this, please!", "Help, my son! He's sick! Do you have any chicken noodles?", "Aye amigo, came straight from the biomes, meh. My senorita wants Doritos, meh! Meh Doritos! Where can I find them?", "HELP! IVE BEEN STUCK ON THIS CAR RIDE FOR 20 HOURS WITHOUT FOOD! I CAN'T LIVE WITHOUT SNACKS, WHERE ARE THE SNACKS AT?", "Hi, I’m just an elderly old woman with 20 grandkids. Where are the pork chops?", "Do you guys have any fresh fish in stock? My boss is expecting a Mongolian hot pot…","Do you guys have any human meat in stock? My boss wants me to organize a barbecue."});
        questions.put("Alcohol Department", new String[]{"Hi, it’s date night tonight and my wife wants wine… Wine!", "Take me to the beer. Where can I get beer!!!", "HANDS UP! Where are you hiding the red wine?"});
        questions.put("Technology Department", new String[]{"Do you, my good friend, know where I can watch Family Guy?", "a", "Where can I get the latest Friday the 13th DVD disc?", "I Scream IV! Where is it?!", "Oy do you know where I can get the Texas Chainsaw Massacre VHS tapes?", "Hi, where can I get Halloween?", "It's a government conspiracy here! Aliens are real!", "Hi, so I dropped my phone into the toliet, where can I get a replacement?", "Top of the mornin’ to ya lads, it’s me Jacksepticeye, here to find Lois from Family Guy. Where can I watch Family Guy?", "Where can I find the latest Rizzard game?", "So, my boy’s birthday is coming up next week and he’s expecting a big, expensive, exciting gift. Where can I get the pirated version of Legacy of Zelda on the NES and Nintendo?", "Hi, so my son tossed my computer into the lake off from a 30 story tall skyscraper so um…… where can I get a new computer?"});
        questions.put("Clothing Department", new String[]{"So, my interviewer expects me to like OMG dress up as Santa Claus during the Interview for the special mall Christmas event, where can I get the Jolly Fat Man skin suit?", "Halloween is coming up next week. Do you have any spooky scary costumes?", "So, why didn’t skeleton go to the ball? Because he had no body to go with… Now give me a body! Where can I find a mannequin?", "Excuse me, my interview is tomorrow and I need formal clothing. Where can I find some?"});
        questions.put("Books Department", new String[] {"Good morning folks, it’s me Jason, here to search for Chicken Doom, the top book of 1983! Where is it?", "Oooh I just love murder. Where can I find a AH a book about murder?", "Where can I get the latest news?", "Do you guys have the latest Tears of the Kingdom history book?", "Pacman! I love that yellow goober. Where can I get a book about Pacman?", "Do you guys have any anime in stock?"});
        questions.put("Medical Department", new String[]{"OMG like oh my gawd, my date is expecting me to look hot tonight? Do you know where I can get like the Beauty and Health lotion?", "Hi, so my hand broke, where can I get another one?", "Help!!! This is an emergency! I just had Mexican food this evening and my stomach is turning up. Do you guys have medicine to treat diarrhea?", "HELP! My baby is waking up, do you have any drugs that can get him to sleep?", "Sanitize your hands! Sanitize your hands! Bless it be in the name of sanitization! Where can I find hand sanitizer?", "Quick, I am becoming MALD/BALD, do you have any drugs that treat hair loss?"});
        
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
        System.out.println("Ah, " + name + "! It's time to prove your skills. You will be in charge of helping customers find items in our store. Here are our departments:");
        System.out.println("\nFood department (f)\nTechnology department (t)\nAlcohol department (a)\nBooks department (b)\nMedical department (m)\nClothing department (c)\n");
        System.out.println("To direct a customer to a department, press its corresponding key as shown above.");

        int points = 0;
        int customerCount = 0;
        boolean end = false;
        while (!end) {
            Random rand = new Random();

            //Grabs set of keys, converts to array, grabs random element from array, converts it to a String, saves the key
            String currentKey = questions.keySet().toArray()[rand.nextInt(questions.size())].toString();
            System.out.println("\nA new customer has arrived!");

            //Grabs corresponding array for key
            String[] keyQuestions = questions.get(currentKey);
            
            //Prints random question for the specific key from its array
            int questionIndex = rand.nextInt(keyQuestions.length);
            System.out.println("\"" + keyQuestions[questionIndex] + "\"");
            System.out.println("Food = f, Tech = t, Alcohol = a, Books = b, Medical = m, Clothing = c");


            String answer = checkAnswer(console);
            customerCount++;
            if (answer.equals(currentKey)) {
                points += 5;
                //Developer testing code, remove before distributing
                System.out.println("Correct answer. Your current points are: " + points);
            }
            
            if (customerCount == 10) {
                end = true;
            }

        }

        console.close();

        System.out.println("\nWell, the day is over. Let's see how you did. I'm checking your employee reviews...");

        if (points == 50) {
            System.out.println("Well well well, we have a top scorer here! 50 points! You will be promoted to manager of Bofa!");
        }
        else if (points >= 30) {
            System.out.println("Nice! Good job. You are a skilled, loyal proletariat.");
        }
        else if (points >= 20){
            System.out.println("Please think about using your brain.");
        }
        else if(points >= 10){
            System.out.println("Community College rejected you.");
        }
        else if(points == 0){
            System.out.println("162.78.32.40: we know that this your IP address. We are coming to take you for our new special research project");
        }
    }

    public static String checkAnswer(Scanner console)
    {

        String answer = console.nextLine().toLowerCase().trim();

        // Avoids nullpointerexception
        if (answer == null) {
            return "";
        }
        

        switch (answer)
        {
            case "f":
                return "Food Department";
            case "t":
                return "Technology Department";
            case "a":
                return "Alcohol Department";
            case "b":
                return "Books Department";
            case "m":
                return "Medical Department";
            case "c":
                return "Clothing Department";
            default:
                return "";
        }


    }
    
}
