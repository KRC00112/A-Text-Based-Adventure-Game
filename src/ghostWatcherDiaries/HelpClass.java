package ghostWatcherDiaries;

import java.util.Scanner;

public class HelpClass {
	

	int a;
	String desc;
	String person;
	String interact;
	Scanner scanner=new Scanner(System.in);
	
	HelpClass(){
		
		
		String[] help= new String[6];
		help[0]="Description";
		help[1]="Inventory";
		help[2]="Status";
		help[3]="Talk";
		help[4]="Interact";
		help[5]="Quit";
		System.out.print("[");
		
		for(int i=0;i<help.length;i++) {
			
			System.out.print(help[i]);
			
			
			if(i<help.length-1) {
				System.out.print(",");
				
			}
			
			
			
			
		}
		
		
		
		
		
		System.out.println("]");
		
	}
	
	
	public String description(int a) {
		
		this.a=a;
		this.desc=desc;
		
		
		if(a==1) {
			
			desc="you are sitting in the office. A clear "
					+ "white room \nwith no visible signs of exit in your "
					+ "view.It has only \ngot two chairs facing one another "
					+ "and a desk placed \nin between the two.You are sitting "
					+ "in one while Bartley ,\noccupies the other.In the desk "
					+ "you see a Bonsai tree, \na pen, a coffee cup made out of "
					+ "plastic filled to the \nbrim with hot coffee,some papers "
					+ "that look official but \nwith no known government insignia on them. ";
			
							
			
		}
		if(a==2) {
			desc="222";
			
		}
		
		
		String descArr[]=desc.split(" ");
		
		for(int i=0;i<descArr.length;i++) {
			
			if(descArr[i].equalsIgnoreCase("bartley")) {
				person="Bartley";
	

				
			
				
				
			}
		
			
			
			
			
			
		}
		return desc;
		
		
		
		

	
	}
	public void status(int a) {
		
		this.a=a;
		System.out.println("");
		System.out.println("Player Status:\n ");
		System.out.println(new Main().name);
		System.out.println("Age: "+new Main().age);
		if(new Main().gender=="null") {
			
			
			System.out.println("Gender: N/A");

		}
		else {
			System.out.println("Gender: "+new Main().gender.substring(0,1));
		}


		
		if(a==1) {
			
			System.out.println("HP: 120");
			
		}
	
	}
	public void inventory(int a) {
		
		this.a=a;
		
		
		if(a==1) {
			System.out.println("inventory array stuff");
			
		}
	
	}
	public void talk(int a) {
		
		this.a=a;
		
		
		if(a==1) {
			System.out.println("Talk to...");
			
			description(1);
			System.out.println(person);
			
			
			
		}
	
	}
	public void interact(int a) {
		
		this.a=a;
		
		
		if(a==1) {
			System.out.println("Interact with...");
			
		}
	
	}
	
	


}
