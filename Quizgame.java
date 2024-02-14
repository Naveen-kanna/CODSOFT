import java.util.*;

class Main
{
    static Scanner sc=new Scanner(System.in);
    static String name;
    static int score = 0;
    
    static void question1()
    {
        System.out.println("\n\n    ----------------------------------------\n");
        System.out.println("       What is a group of crows called?\n");
        System.out.println("        A.a Herd               B.a Troop ");    
        System.out.println("        C.a Mob                D.a Murder ");    
        char a = sc.next().charAt(0);
        System.out.println("    A group of crows is called a murder.");
        if(a=='d' || a=='D')
        {
            score +=10;
            System.out.println("    Correct Answer. You got 10 points displaying Next Question");
            question2();
        }
        else if(a=='A' || a=='a' || a=='B' || a=='b' || a=='C' || a=='c')
        {
            System.out.println("    Wrong Answer.  The Right Answer is a Murder. Option 'D' ");
            question2();
        }
        else 
        {
            System.out.println("    Wrong input. Please enter a valid option");
            question1();
        }
    }
    
    static void question2()
    {
        System.out.println("\n\n    ----------------------------------------\n");
        System.out.println("       What planet is closest to the sun?\n");
        System.out.println("        A. Mercury               B. Venus ");    
        System.out.println("        C. Earth                 D. Saturn ");    
        char a = sc.next().charAt(0);
        System.out.println("    'Mercury' is the planet closest to the Sun. ");
        if(a=='A' || a=='a')
        {
            score +=10;
            System.out.println("    Correct Answer. You got 10 points displaying Next Question");
            question3();
        }
        else if(a=='D' || a=='d' || a=='B' || a=='b' || a=='C' || a=='c')
        {
            System.out.println("    Wrong Answer.  The Right Answer is Mercury. Option 'A' is Correct.");
            question3();
        }
        else
        {
            System.out.println("    Wrong input. Please enter a valid option");
            question2();
        }
    }
    static void question3()
    {
        System.out.println("\n    ----------------------------------------------------------\n");
        System.out.println("       What is the only flag that does not have four sides?\n");
        System.out.println("           A. China                 B. Georgia ");    
        System.out.println("           C. Nepal                 D. Bhutan ");    
        char a = sc.next().charAt(0);
        System.out.println("    The national flag of 'NEPAL' is the world's only national flag that is non-quadrilateral in shape.");
        if(a=='C' || a=='c')
        {
            score +=10;
            System.out.println("    Correct Answer. You got 10 points displaying Next Question");
            question4();
        }
        else if(a=='A' || a=='a' || a=='B' || a=='b' || a=='D' || a=='d')
        {
            System.out.println("    Wrong Answer.  The Right Answer is Nepal. Option 'C' is Correct.");
            question4();
        }
        else
        {
            System.out.println("    Wrong input. Please enter a valid option");
            question3();
        }
    }
    static void question4()
    {
        System.out.println("\n    -------------------------------------------------\n");
        System.out.println("       How many dots appear on a pair of dice?\n");
        System.out.println("        A. 36                 B. 54 ");    
        System.out.println("        C. 48                 D. 42 ");    
        char a = sc.next().charAt(0);
        System.out.println("    The total number of dots on the 2 dice together is '42' dots");
        if(a=='D' || a=='d')
        {
            score +=10;
            System.out.println("    Correct Answer. You got 10 points displaying Next Question");
            question5();
        }
        else if(a=='A' || a=='a' || a=='B' || a=='b' || a=='C' || a=='c')
        {
            System.out.println("    Wrong Answer.  The Right Answer is 42. Option 'D' is Correct.");
            question5();
        }
        else 
        {
            System.out.println("    Wrong input. Please enter a valid option");
            question4();
        }
    }
    static void question5()
    {
        System.out.println("\n    -------------------------------------------------------------------\n");
        System.out.println("       Which is the only body part that is fully grown from birth?\n");
        System.out.println("           A. Eyes                 B. Liver ");    
        System.out.println("           C. Hands                D. Knee Caps ");    
        char a = sc.next().charAt(0);
        System.out.println("    The eyeball is the only organism which does not grow from birth.");
        if(a=='A' || a=='a')
        {
            score +=10;
            System.out.println("    Correct Answer. You got 10 points displaying Next Question");
            question6();
        }
        else if(a=='D' || a=='d' || a=='B' || a=='b' || a=='C' || a=='c')
        {
            System.out.println("    Wrong Answer.  The Right Answer is Eyes. Option 'A' is Correct.");
            question6();
        }
        else
        {
            System.out.println("    Wrong input. Please enter a valid option");
            question5();
        }
    }
    static void question6()
    {
        System.out.println("\n    ----------------------------------------------\n");
        System.out.println("       What is the chemical symbol for Gold?\n");
        System.out.println("           A. Au                B. Ag ");    
        System.out.println("           C. Go                D. Gd ");    
        char a = sc.next().charAt(0);
        System.out.println("    The chemical symbol for Gold is 'Au'.");
        if(a=='A' || a=='a')
        {
            score +=10;
            System.out.println("    Correct Answer. You got 10 points displaying Next Question");
            question7();
        }
        else if(a=='A' || a=='a' || a=='B' || a=='b' || a=='C' || a=='c')
        {
            System.out.println("    Wrong Answer.  The Right Answer is Au. Option 'A' is Correct.");
            question7();
        }
        else
        {
            System.out.println("    Wrong input. Please enter a valid option");
            question6();
        }
    }
    static void question7()
    {
        System.out.println("\n    ----------------------------------------------\n");
        System.out.println("       How many teeth does an adult human have?\n");
        System.out.println("           A. 36                B. 28 ");    
        System.out.println("           C. 40                D. 32 ");    
        char a = sc.next().charAt(0);
        System.out.println("    A full set of adult teeth will amount to 32 teeth in total.    ");
        if(a=='D' || a=='d')
        {
            score +=10;
            System.out.println("    Correct Answer. You got 10 points displaying Next Question");
            question8();
        }
        else if(a=='A' || a=='a' || a=='B' || a=='b' || a=='C' || a=='c')
        {
            System.out.println("    Wrong Answer.  The Right Answer is 32. Option 'D' is Correct.");
            question8();
        } 
        else
        {
            System.out.println("    Wrong input. Please enter a valid option");
            question7();
        }
    }
    static void question8()
    {
        System.out.println("\n    ----------------------------------------------\n");
        System.out.println("       What is the strongest muscle in the human body?\n");
        System.out.println("           A. Biceps                B. Quadriceps ");    
        System.out.println("           C. Heart                 D. Jaw muscle ");    
        char a = sc.next().charAt(0);
        System.out.println("    The strongest muscle based on its weight is the masseter(Jaw muscle).    ");
        if(a=='D' || a=='d')
        {
            score +=10;
            System.out.println("    Correct Answer. You got 10 points displaying Next Question");
            question9();
        }
        else if(a=='A' || a=='a' || a=='B' || a=='b' || a=='C' || a=='c')
        {
            System.out.println("    Wrong Answer.  The Right Answer is Jaw muscle. Option 'D' is Correct.");
            question9();
        }
        else 
        {
            System.out.println("    Wrong input. Please enter a valid option");
            question8();
        }
    }
    static void question9()
    {
        System.out.println("\n    ----------------------------------------------\n");
        System.out.println("       What is the world's largest desert?\n");
        System.out.println("           A. Siberian Desert       B. Sahara ");    
        System.out.println("           C. Antarctic Desert      D. Great Australian ");    
        char a = sc.next().charAt(0);
        System.out.println("    'Antarctic Polar Desert' is the largest desert in the world.    ");
        if(a=='C' || a=='c')
        {
            score +=10;
            System.out.println("    Correct Answer. You got 10 points displaying Next Question");
            question10();
        }
        else if(a=='A' || a=='a' || a=='B' || a=='b' || a=='D' || a=='d')
        {
            System.out.println("    Wrong Answer.  The Right Answer is Antarctic Desert. Option 'C' is Correct.");
            question10();
        } 
        else
        {
            System.out.println("    Wrong input. Please enter a valid option");
            question9();
        }
    }
    
    static void question10()
    {
        System.out.println("\n    --------------------------------------------------\n");
        System.out.println("       What is the largest mammal in the world?\n");
        System.out.println("           A. Blue whale       B. Giraffe ");    
        System.out.println("           C. Elephant         D. Lion ");    
        char a = sc.next().charAt(0);
        System.out.println("    'Antarctic Polar Desert' is the largest desert in the world.    ");
        if(a=='A' || a=='a')
        {
            score +=10;
            System.out.println("    Correct Answer. You got 10 points displaying Next Question");
            result();
        }
        else if(a=='D' || a=='d' || a=='B' || a=='b' || a=='D' || a=='d')
        {
            System.out.println("    Wrong Answer.  The Right Answer is Antarctic Desert. Option 'C' is Correct.");
            result();
        } 
        else 
        {
            System.out.println("    Wrong input. Please enter a valid option");
            question10();
        }
    }
    static void result()
    {
        System.out.println("    "+name+" you have scored "+score+" out of 100.");
        
    }
    public static void main(String [] args)
    {
        System.out.println("    Welcome to the Quiz \n");
        System.out.println("    We will be asking 10 questions each question carries 10 points.\n");
        System.out.println("    Enter you Name: ");
        name = sc.nextLine();
        question1();
    }
}