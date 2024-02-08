import java.util.*;
import java.util.stream.Collectors;

public class RanNumGame
{
    static Scanner sc=new Scanner(System.in);
    static Map<String, Integer> keyValueMap = new HashMap<>();
    public static int random;
    public static int first=1;
    public static int randomNoGenerator(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
	public static void main(String[] args) {
		random=randomNoGenerator(1,100);
		menu();
	}
	public static void instructions(){
	    System.out.println("     ________________________________________ ");
	    System.out.println("    |                                        |");
	    System.out.println("    |    -> You will have THREE tries        |");
	    System.out.println("    |       to guess the CORRECT NUMBER      |");
	    System.out.println("    |                                        |");
	    System.out.println("    |    -> If you guess CORRECT value       |");
	    System.out.println("    |       you will get 10 points           |");
	    System.out.println("    |                                        |");
	    System.out.println("    |    -> If you guess 1 - 15 values       |");
	    System.out.println("    |       closer to the actual number      |");
	    System.out.println("    |       you will get 7 points            |");
	    System.out.println("    |                                        |");
	    System.out.println("    |    -> If you guess 15 - 30 values      |");
	    System.out.println("    |       closer to the actual number      |");
	    System.out.println("    |       you will get 5 points            |");
	    System.out.println("    |                                        |");
	    System.out.println("    |    -> If you guess above 30 value      |");
	    System.out.println("    |       closer to the actual number      |");
	    System.out.println("    |       you will get 3 points            |");
	    System.out.println("    |                                        |");
	    System.out.println("    |         Press 1 to go to Menu          |");
	    System.out.println("    |                                        |");
	    System.out.println("    |           Press 2 to Exit              |");
	    System.out.println("    |                                        |");
	    System.out.println("     ----------------------------------------\n\n");
	    int input = sc.nextInt();
	    if(input==1){
	        menu();
	    }else if(input==2){
	        System.exit(1000);
	    }else{
	        System.out.println("     You Have Entered wrong Input Enter again ");
	        instructions();
	    }
	}
	
	
	public static void scoreBoard(){
	    System.out.println("        ||  --  SCOREBOARD  --  ||    ");
        System.out.println("     --------------------------------- ");
        if (!keyValueMap.isEmpty()) {
            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(keyValueMap.entrySet());
            entryList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

            Map<String, Integer> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : entryList) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
                        
            for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
                String name = entry.getKey();
                int score = entry.getValue();
                System.out.println("        Name: " + name + "   Score: " + score);
            }
        System.out.println("     ---------------------------------");
            
        } else {
            System.out.println("            The ScoreBoard is Empty");
        }
        menu();
	}
	
	public static void menu(){
	    System.out.println("     _______________________________ ");
	    System.out.println("    |                               |");
	    System.out.println("    |     Press 1 to Play Game      |");
	   // if(first==1){
	        
	   //     first++;
	   // }else{
    //         System.out.println("|     Press 1 to Play Again     |");
	   // }
	    System.out.println("    |                               |");
	    System.out.println("    |   Press 2 to see ScoreBoard   |");
	    System.out.println(    "    |                               |");
	    System.out.println("    |      Press 3 to End Game      |");
	    System.out.println("    |                               |");
	    System.out.println("    |  Press 4 to see instructions  |");
	    System.out.println("    |                               |");
	    System.out.println("     -------------------------------\n\n");
	    int input = sc.nextInt();
	    if(input==1){
	        NumberGame();
	       //System.exit(2000);
	    }else if(input==2){
	        scoreBoard();
	    }else if(input==3){
	        System.out.println("    Thank you! Come Again");
	        System.exit(1000);
	    }else if(input==4){
	        instructions();
	    }else{
            System.out.println("     You Have Entered wrong Input Enter again ");
            menu();
	        
	    }
	}
	public static void options(int random){
	    System.out.println("     __________________________ ");
	    System.out.println("    |                          |");
	    System.out.println("    |   Press 1 to Main Menu   |");
	    System.out.println("    |                          |");
	    System.out.println("    |   Press 2 to Exit Game   |");
	    System.out.println("    |                          |");
	    System.out.println("     --------------------------");
	}
	
	public static void NumberGame(){
	   int attempts = 3;
	   int score=0;
	   boolean hasGuessedCorrectly = false;
	   while(!hasGuessedCorrectly&&attempts>0) 
	        {
	            System.out.print("    Enter your guess: ");
	            int userGuess = sc.nextInt();

	            if(userGuess>0 && userGuess<=100)
	            {
		            if (userGuess == random) 
		            {
		                System.out.println("     Congratulations You have Guessed Correct Number");
		            	score= score+(10*attempts);
		                hasGuessedCorrectly = true;
		            }else if(Math.abs(userGuess - random) <= 15){
		                score+=7;
		                System.out.println("     You are a very Closer to the Number ");
		            }else if(Math.abs(userGuess - random) <= 30){
		                score+=5;
		                System.out.println("     You are Closer to the Number ");
		            }else if(Math.abs(userGuess - random) > 30){
		                score+=3;
		                System.out.println("     You are very Far to the Number ");
		            }
	            attempts--;
		           
	            }
	            else
	            {
	            	System.out.println("    Try to guess a number in between 1 to 100 \n");
	            }
	        }
	        System.out.println("    \n\n     The  Random number is : "+random+"\n");
	        System.out.println("\n\n     Enter your Name:  ( * Only 6 Characters * ) \n");
	        String n=sc.nextLine();
	        String name = sc.nextLine();
	        keyValueMap.put(name,score);
	        menu();
	}
}