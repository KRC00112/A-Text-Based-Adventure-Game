package ghostWatcherDiaries;

import java.util.InputMismatchException;
import java.util.Scanner;

import roughTest.LoadingBarRunnable;

public class Main implements Runnable{
	
	public final static String redLine="\u001B[31m";
	
	public final static String resetColor="\u001B[0m";
	
	public final static String greenLine="\u001B[32m";
	
	static int a,b,c,d,e;
	static String name="";
	static int age;
	static String gender;
	static BartleyDialogues bd=new BartleyDialogues();
	

	static int DialogueIndex=1;
	static int choose = 0;

	
	
	
	static Scanner scanner=new Scanner(System.in);

	

	public static void main(String[] args) {
		
		Main runnable=new Main();
		Thread thread=new Thread(runnable);
		
		thread.start();


	}
	
	
	
	public static void main2(){
		// TODO Auto-generated method stub
		//Design Header Stuff
		String programName="\r\n"
				+ "   ____ _               _    __        __    _       _                 ____  _            _           \r\n"
				+ "  / ___| |__   ___  ___| |_  \\ \\      / /_ _| |_ ___| |__   ___ _ __  |  _ \\(_) __ _ _ __(_) ___  ___ \r\n"
				+ " | |  _| '_ \\ / _ \\/ __| __|  \\ \\ /\\ / / _` | __/ __| '_ \\ / _ \\ '__| | | | | |/ _` | '__| |/ _ \\/ __|\r\n"
				+ " | |_| | | | | (_) \\__ \\ |_    \\ V  V / (_| | || (__| | | |  __/ |    | |_| | | (_| | |  | |  __/\\__ \\\r\n"
				+ "  \\____|_| |_|\\___/|___/\\__|    \\_/\\_/ \\__,_|\\__\\___|_| |_|\\___|_|    |____/|_|\\__,_|_|  |_|\\___||___/\r\n"
				+ "                                                                                                      \r\n"
				+ "\r\n"
				+ "";
	
		
		
		System.out.println("________________________________________________________________________________________________________");
		System.out.println(programName);
		System.out.println("                          A text based adventure written in Java                                       ");
		System.out.println("\n\n Version 1.0                                                               By Kaustav Raj Chakraborty");
		System.out.println("________________________________________________________________________________________________________\n");
		//Designing Header ends

		
		

		//general character creation

		System.out.println("Alllright let's see what we have here. ");
		System.out.println("Hello there. you may call me Bartley, I will be your let's just "
				+ "\nsay...the guide throughout this trial of yours,please make \nyourselves comfortable "
				+ "and seated while I go over your documents.");
		
		System.out.println("Let's start from the beginning, it says here, that your name is... ");
		
		
		System.out.println("[What is your name?]");
		System.out.println();
		
		System.out.print(greenLine+">>> ");
		name=scanner.nextLine();
		System.out.println(resetColor);
		
		
		while(name.isBlank()){
			
			System.out.println("You had to have some name. Why don't you fill in your \nname "
					          + "While I take some sips of this delicious Coffee. \nSound good?");
			
			System.out.println("[What is your name?]");
			System.out.println();
			
			System.out.print(greenLine+">>> ");
			name=scanner.nextLine();
			System.out.println(resetColor);
		
		}
			
		
		if(!(name.isBlank())) {

		String[] nameArr=name.split(" ");
		String firstName=nameArr[0];
		String lastName=nameArr[nameArr.length-1];

		
		System.out.println("So your name is "+firstName+" huh?");

		if (nameArr.length==1) {
			System.out.println("No last name? well,That's quite alright.It just that \nit "
					+ "helps if you have one, makes sorting through the database \nless of"
					+ " a pain.But you don't have to worry about that, forget \ni even mentioned.");
			
		}

		if(nameArr.length>1) {
			System.out.println("and your last name is..hmmm,let's see, "+lastName.substring(0, ((int)(lastName.length()-1)/3))+".."+lastName.substring(0, ((int)(lastName.length()-1)/2))+""+"..."+lastName+"?,\ndid i get that right?");
		}
		
		
		}

		System.out.println("Now, as for your age....");
		
			do {
			System.out.println("[What is your age?]");
			System.out.println();
			System.out.print(greenLine+">>> ");
	
		
			  
	
				try {
					
					age=scanner.nextInt();
					scanner.nextLine();
					System.out.println(resetColor);

					
				    if (age>0 && age<12){
				    	System.out.println("You were practically a child then...");
				    }
				    else if (age>=12 && age<18){
				    	System.out.println("You were a teenager then...");
				    }
				    else if (age>=18 && age<30) {
				    	System.out.println("you were still in your prime then...");
				    	
				    }
				    else if (age>=30) {
				    	System.out.println("you were pretty old then...");
				    }
				    
				    else {
						System.out.println("No that can't be right..let me check again.");
		
				    }
			    
			    
			    
			}catch(InputMismatchException e) {
				System.out.println(resetColor);
				System.out.println("Seriously? Please don't do this to me right now.Come on fix "
						+ "\nthis \"miss-input\" and I will let you off the hook this one time."
						+ "\nPlease take care as to what you input..in..future..official \nprocedures.");
				
                scanner.nextLine(); // Clear the buffer
				
				age=0;
			
				
			}
		}while(age<=0);


		System.out.println("As for your gender let's see...\nThis isn't a compulsory"
				+ " question but it's also fine \nif you have already put in something  ");

		System.out.println("[What is your gender ?]");
		System.out.println();
		System.out.print(greenLine+">>> ");

		gender=scanner.nextLine();
		System.out.println(resetColor);

		gender=gender.toUpperCase();

		if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("m")) {
			System.out.println("oh!so you are a male.");
			
		}
		else if(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("f")) {
			System.out.println("oh!So you are a female.");
		}
		else {
			System.out.println("guess you did skip it...as I said it's fine.");
			gender="null";
			
		}
		
	

		// character creation ends

		// start telling user about the situation
		
		
		
		System.out.println("Okay! so that's about it. We are done reviewing"
				+ " your \ndocuments.As I said I am Bartley and I will take all"
				+ " \nyour questions now.");
		
		System.out.println("So, do you have any? ");
		System.out.println();
		
		talkToBartley();
		
		
		help(2,1);
		//status in any case might always be passed as 1 whenever called as an argument.not sure but might be that updating HP should be more than enough
	

		
		
	}
	
	
	
	
	public static void help(int a,int b) {
		
		do {
		System.out.println("Enter [Help] for further assistance");
		System.out.print(greenLine+">>> ");
		String help=scanner.nextLine();
		System.out.println(resetColor);
		if(help.equalsIgnoreCase("help")) {
			
			new HelpClass();
			
		}
		
		else if(help.equalsIgnoreCase("description")||help.equalsIgnoreCase("desc")) {
			    String description = new HelpClass().description(a);
			    System.out.println(description);
			    System.out.println("\npress [enter] to continue ");
			    scanner.nextLine();

		}
		else if(help.equalsIgnoreCase("inventory")) {
			new HelpClass().inventory(b);
			
			System.out.println("\npress [enter] to continue ");
			scanner.nextLine();
		}
		else if(help.equalsIgnoreCase("status")) {
			new HelpClass().status();
			System.out.println("\npress [enter] to continue ");
			scanner.nextLine();
		}
		else if(help.equalsIgnoreCase("talk")) {
			new HelpClass().talk();
			System.out.print(greenLine+">>> ");

			String talkTo=scanner.nextLine();
			System.out.println(resetColor);

			
			if(talkTo.equalsIgnoreCase("Bartley")) {
			
			
			
			
				talkToBartley();
				
				
			
			}
			
			
			
			
			
			
			System.out.println("\npress [enter] to continue ");
			scanner.nextLine();
			
			
			
		}
		else if(help.equalsIgnoreCase("interact")) {
			new HelpClass().interact();
			System.out.print(greenLine+">>> ");

			String use=scanner.nextLine();
			System.out.println(resetColor);

			
//			if(use.equalsIgnoreCase("pen")) {
//			
//			
//			
//			
//				usePen();
//				
//				
//			
//			}
			

			
			System.out.println("\npress [enter] to continue ");
			scanner.nextLine();
		}
		
		else if(help.equalsIgnoreCase("quit")) {
			
			System.out.println("Quit program?(Y/n): ");
			
			System.out.print(greenLine+">>> ");
			String quit=scanner.nextLine();
			System.out.println(resetColor);
			
			if(quit.equalsIgnoreCase("y")) {
				
				System.out.println("See you soon ;)");
				
				break;
				
				
			}
			else if(quit.equalsIgnoreCase("n")) {
				
			}
			else if(!(quit.equalsIgnoreCase("n")||quit.equalsIgnoreCase("y"))) {
				
				
				System.out.println(redLine+"[enter valid input]"+resetColor);
				
			}

		}
		
		
		
		}while(true);
		
		
		
		
		
	}
	
	
	public static void talkToBartley() {
		
		do {
			
			try {
				bd.questions(DialogueIndex);
				System.out.println();
				System.out.print(greenLine+">>> ");
				choose=scanner.nextInt();
				scanner.nextLine();
				System.out.println(resetColor);
				bd.answers(DialogueIndex, choose);
			}catch(InputMismatchException e) {
				
				System.out.println(redLine+"[Enter numbers only]"+resetColor);
				
				scanner.nextLine();
				
				
				
			}
		}while((choose!=5));
		
		
		
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.print(greenLine);
		System.out.print("Loading Files:    [");
		for(int i=0;i<50;i++) {
			
			
			System.out.print("\u25A0");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.print("]");
		System.out.println();

		System.out.print("Starting Program: [");
		for(int i=0;i<50;i++) {
			
			
			System.out.print("\u25A0");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.print("]");
		System.out.println();
		
		
		System.out.println(resetColor);
		
		main2();
		
		
	}
	

}
