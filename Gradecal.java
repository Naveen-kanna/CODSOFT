import java.util.*;

class Gradecal
{
    static Scanner sc=new Scanner(System.in);
    static String name;
    static int Flanguage;
    static int Slanguage;
    static int English;
    static int math;
    static int Science;
    static int Social;
    
	public static void rankCard(int totalMarks,float percentage, char grade){
	    System.out.println("    Name : "+name);
	    System.out.println("     ___________________________________________");
	    System.out.println("    |                                           |");
	    System.out.println("    |      Subject       |      Marks ( 100 )   |");
	    System.out.println("    |                                           |");
	    System.out.println("     -------------------------------------------");
	    System.out.println("    |  First Language    |       "+Flanguage+"             |");
	    System.out.println("    |  Second Language   |       "+Slanguage+"             |");
	    System.out.println("    |  English           |       "+English+"             |");
	    System.out.println("    |  Mathmatics        |       "+math+"             |");
	    System.out.println("    |  Science           |       "+Science+"             |");
	    System.out.println("    |  Social            |       "+Social+"             |");
	    System.out.println("    |                                           |");
	    System.out.println("     -------------------------------------------");
        System.out.println("    |    Total Marks Obtained    "+totalMarks+"            |");
        System.out.println("    |    Percentage Obtained     "+String.format("%.2f", percentage)+"          |");
        System.out.println("    |            Grade           "+grade+"              |");
	    System.out.println("     -------------------------------------------\n");
	    if (grade == 'A')
	    {
            System.out.println("    Congratulations! You got an 'A' Grade. Keep up the excellent work and maintain consistency!");
        } 
        else if (grade == 'B') 
        {
            System.out.println("    Congratulations! You got a 'B' Grade. Focus and concentrate to improve further.");
        } 
        else if (grade == 'C') 
        {
            System.out.println("    Well done! You achieved a 'C' Grade. Keep working hard to enhance your performance.");
        } 
        else if (grade == 'D')
        {
            System.out.println("    Good effort! You earned a 'D' Grade. Identify areas for improvement and work on them.");
        } 
        else if (grade == 'F')
        {
            System.out.println("    Unfortunately, you received an 'F' Grade. Reflect on your performance and seek ways to improve in the future.");
        } 
        else
        {
            System.out.println("    Invalid grade entered. Please check your grade and try again.");
        }
	}
	
	public static void percentCalculator()
	{
	    int totalMarks = Flanguage + Slanguage + English + math + Science + Social;
        float percentage = (float) totalMarks / 6;
        char grade = gradeAssign(percentage);
        rankCard(totalMarks,percentage,grade);
	}
	
	public static char gradeAssign(float percentage)
	{
	    if(percentage>=90)
	    {
	        return 'A';
	    }
	    else if(percentage >=80 && percentage<90)
	    {
	        return 'B';
	    }
	    else if(percentage <80 && percentage>=65)
	    {
	        return 'C';
	    }
	    else if(percentage >=45 && percentage <65)
	    {
	        return 'D';
	    }
	    else if(percentage <45)
	    {
	        return 'F';
	    }
	    else
	    {
	        return 'Z';
	    }
	}
	
	
    public static void firstLanguage()
    {
        System.out.println("    Enter First Language Marks:  ( * Hindi * ) ");
        int marks= sc.nextInt();
        if(marks<=100 && marks>=0)
        {
            Flanguage=marks;
            secondLanguage();
        }
        else
        {
            System.out.println("    Please enter the marks between the range of 0 to 100 again for First Language");
            firstLanguage();
        }
    }
    
    public static void secondLanguage()
    {
        System.out.println("    Enter Second Language Marks : ( * Telugu * )");
        int marks= sc.nextInt();
        if(marks<=100 && marks>=0)
        {
            Slanguage=marks;
            english();
        }
        else
        {
            System.out.println("    Please enter the marks between the range of 0 to 100 for Second Language");
            secondLanguage();
        }
    }
    
    public static void english()
    {
        System.out.println("    Enter English Marks: ");
        int marks= sc.nextInt();
        if(marks<=100 && marks>=0)
        {
            English=marks;
            mathmatics();
        }
        else
        {
            System.out.println("    Please enter the marks between the range of 0 to 100 for English subject");
            english();
        }
    }
    
    public static void mathmatics()
    {
        System.out.println("    Enter Mathmatics Marks : ");
        int marks= sc.nextInt();
        if(marks<=100 && marks>=0)
        {
            math=marks;
            science();
        }
        else
        {
            System.out.println("    Please enter the marks between the range of 0 to 100 for Mathmatics subject");
            mathmatics();
        }
    }
    public static void science()
    {
        System.out.println("    Enter Science Marks: ");
        int marks= sc.nextInt();
        if(marks<=100 && marks>=0)
        {
            Science=marks;
            social();
        }
        else
        {
            System.out.println("    Please enter the marks between the range of 0 to 100 for Science subject");
            science();
        }
    }
    public static void social()
    {
        System.out.println("    Enter Social Marks : ");
        int marks= sc.nextInt();
        if(marks<=100 && marks>=0)
        {
            Social=marks;
            percentCalculator();
        }
        else
        {
            System.out.println("    Please enter the marks between the range of 0 to 100 for Social subject");
            social();
        }
    }
	public static void main(String[] args)
	
	{
	    System.out.println("    Enter your Name : ");
        name = sc.nextLine();
        System.out.println("    Please Enter the marks accordingly in the range of 1 to 100 only");
        firstLanguage();
	}
	
	
}