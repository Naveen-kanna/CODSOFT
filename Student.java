//package PusedoCodes;
import java.util.*;
class Courses {
	static Courses c1 = new Courses("c1","Java","Complete Core to Advance Java","1st March, 2024",5);
	static Courses c2 = new Courses("c2","SQL","Complete SQL Tutorial","3rd March, 2024",5);
	static Courses c3 = new Courses("c3","Python","Complete Python training till libraries","5th March, 2024",5);
	static Courses c4 = new Courses("c4","HTML/CSS","Complete HTML and CSS all important things","7th March, 2024",5);
	static Courses c5 = new Courses("c5","JavaScript","Complete JavaScript and Dynamic Web Pages","10th March, 2024",5);
	String course_code;
	String course_title;
	String course_description;
	String course_schedule;
	int course_capacity;
	int course_avialability = course_capacity;
	Courses(String course_code, String course_title, String course_description, String course_schedule,int course_capacity){
		this.course_code = course_code;
		this.course_title = course_title;
		this.course_description = course_description;
		this.course_schedule = course_schedule;
		this.course_capacity = course_capacity;
	}
	void display_course()
	{
		System.out.println("Course Code: "+course_code);
		System.out.println("Course Title: "+course_title);
		System.out.println("Course Description: "+course_description);
		System.out.println("Course Capacity: "+course_capacity+" Students");
		System.out.println("Course Schedule: "+course_schedule);
	}
}
class Students{
	int st_id;
	String st_name;
	ArrayList<Courses> course_list = new ArrayList<>();
	Students(int st_id,String st_name){
		this.st_id = st_id;
		this.st_name = st_name;
	}
	void reg_course() {
		System.out.println("Enter which course you want to register");
		System.out.print("1. ");Courses.c1.display_course();
		System.out.print("2. ");Courses.c2.display_course();
		System.out.print("3. ");Courses.c3.display_course();
		System.out.print("4. ");Courses.c4.display_course();
		System.out.print("5. ");Courses.c5.display_course();
		int n = Main.sc.nextInt();
		switch (n) {
		case 1:
		{
			boolean b = true;
			if(course_list.isEmpty())
			{
				course_list.add(Courses.c1);
				
			}
			else {
			for(int i=0;i<course_list.size();i++)
			{
				if(course_list.get(i).course_title.equals(Courses.c1.course_title)) {
					System.out.println("Course Already Registered...!");
					b = false;
				}
			}
			if(b)
			{
			course_list.add(Courses.c1);
			System.out.println("Selected Course Added Successfully");
			}
			}
			break;
		}
		case 2:
		{
			boolean b = true;
			if(course_list.isEmpty())
			{
				course_list.add(Courses.c2);
				
			}
			else {
			for(int i=0;i<course_list.size();i++)
			{
				if(course_list.get(i).course_title.equals(Courses.c2.course_title)) {
					System.out.println("Course Already Registered...!");
					b = false;
				}
			}
			if(b)
			{
			course_list.add(Courses.c2);
			System.out.println("Selected Course Added Successfully");
			}
			}
			break;
		}
		case 3:
		{
			boolean b = true;
			if(course_list.isEmpty())
			{
				course_list.add(Courses.c3);
				
			}
			else {
			for(int i=0;i<course_list.size();i++)
			{
				if(course_list.get(i).course_title.equals(Courses.c3.course_title)) {
					System.out.println("Course Already Registered...!");
					b = false;
				}
			}
			if(b)
			{
			course_list.add(Courses.c3);
			System.out.println("Selected Course Added Successfully");
			}
			}
			break;
		}
		case 4:
		{
			boolean b = true;
			if(course_list.isEmpty())
			{
				course_list.add(Courses.c4);
				
			}
			else {
			for(int i=0;i<course_list.size();i++)
			{
				if(course_list.get(i).course_title.equals(Courses.c4.course_title)) {
					System.out.println("Course Already Registered...!");
					b = false;
				}
			}
			if(b)
			{
			course_list.add(Courses.c4);
			System.out.println("Selected Course Added Successfully");
			}
			}
			break;
		}
		case 5:
		{
			boolean b = true;
			if(course_list.isEmpty())
			{
				course_list.add(Courses.c5);
				
			}
			else {
			for(int i=0;i<course_list.size();i++)
			{
				if(course_list.get(i).course_title.equals(Courses.c5.course_title)) {
					System.out.println("Course Already Registered...!");
					b = false;
				}
			}
			if(b)
			{
			course_list.add(Courses.c5);
			System.out.println("Selected Course Added Successfully");
			}
			}
			break;
		}
		default:
			System.out.println("Invalid Selection");
		}
	}
	void view_courses(){
		if(course_list.isEmpty())
			System.out.println("Your Course List is Empty");
		else
		{
			for(int i=0;i<course_list.size();i++)
			{
				course_list.get(i).display_course();
				System.out.println("----------------------");
			}
		}
	}
	void remove_courses() {
		if(course_list.isEmpty())
			System.out.println("Your Course List is Empty");
		else
		{
			System.out.println("Which Course You want to remove enter course title");
			for(int i=0;i<course_list.size();i++)
			{
				course_list.get(i).display_course();
				System.out.println("-----------------------");
			}
		}
		String s = Main.sc.next();
		for(int i=0;i<course_list.size();i++)
		{
			if(!course_list.get(i).course_title.equalsIgnoreCase(s))
			{
				System.out.println("Course not present in your list");
			}
			else {
				course_list.remove(i);
				System.out.println("Course Removed Successfully...");
			}
		}
	}
}
class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to MyCourses");
		System.out.println("Enter 1 to register / Enter 2 to exit");
		int n = sc.nextInt();
		if(n==1)
		{
			register();
		}
	}
	static void register() {
		System.out.println("Enter Your Student Id and Student Name");
		Students st1 = new Students(sc.nextInt(),sc.next());
		System.out.print("Please Wait");
		for(int i=0; i<3;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){}
			System.out.print(". ");
		}
		System.out.println();
		System.out.println("Registration Successful");
		System.out.println("To Register the courses enter 1");
		int n = sc.nextInt();
		if(n==1)
		{
			st1.reg_course();
		}
		boolean b = true;
		while(b) {
		System.out.println("1. Register for More Courses\n 2. View Courses 3. Remove Courses 4. Exit");
		int n1 = sc.nextInt();
		switch (n1) {
		case 1:
		{
			st1.reg_course();
			break;
		}
		case 2:
		{
			st1.view_courses();
			break;
		}
		case 3:
		{
			st1.remove_courses();
			break;
		}
		case 4:
		{
			b = false;
			break;
		}
		default:
		{
			
		}
			break;
		}
	 }
	}
}