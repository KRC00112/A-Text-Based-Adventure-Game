package ghostWatcherDiaries;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HelpClass {
	

	int a;
	String desc=" ";
	String person;
	String interact;
	Scanner scanner=new Scanner(System.in);
	
	static String[] people= {"michael","richard","kevin","bartley","sarah","Joey","garnt","grant"};
 	static String[] objects= {"pen","drugs","television"};

	
	static String descLower;
	static String[] descArray;
	static Set<String> wordSet;
	
	static int c;
	
    boolean descriptionViewed = false;

	
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
			
			desc="you are sitting in the office . A clear "
					+ "white room \nwith no visible signs of exit in your "
					+ "view . It has only \ngot two chairs facing one another "
					+ "and a desk placed \nin between the two.You are sitting "
					+ "in one while Bartley ,\noccupies the other.In the desk "
					+ "you see a Bonsai tree , \na pen , a coffee cup made out of "
					+ "plastic filled to the \nbrim with hot coffee,some papers "
					+ "that look official but \nwith no known government insignia on them. Joey drugs pen ";
			
							
			
		}
		if(a==2) {
			desc="qwe joey television richard";
			
		}
		
		

		
		c=a;
		
		descLower=desc.toLowerCase();
		
		descArray=descLower.split(" ");
		
		wordSet=new HashSet<>();
		return desc;
		
		
		
		

	
	}
	public void status() {
		
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


		
		
			
			System.out.println("HP: 120");
			
		
	
	}
	public void inventory(int a) {
		
		this.a=a;
		
		
		if(a==1) {
			System.out.println("inventory array stuff");
			
		}
	
	}
	public void talk() {
		
		int talkIndex=1;
		this.a=a;

		
		
//		if(a==1) {
		
		if (new Main().descV==false) {
            System.out.println("Make sure you have viewed the entire room first.\nEnter [ANY BUTTON] to go back.");
            return;
		}
	
	
		else {
			System.out.println("Talk to...");
			description(c);
			for(int i=0;i<descArray.length;i++) {
				
				wordSet.add(descArray[i]);
			}
			
			
	        String[] uniqueWords = wordSet.toArray(new String[0]);
		
			for(int i=0;i<uniqueWords.length;i++) {
				
				
				for(int k=0;k<people.length;k++) {
					
					if(people[k].equalsIgnoreCase(uniqueWords[i])) {
						
						
							System.out.println(talkIndex+". "+people[k].substring(0, 1).toUpperCase()+""+people[k].substring(1,people[k].length()));
							talkIndex++;
						
						}	
					}	
				}
			
		}
			
	
		
			
			
//		}
	
	}
	public void interact() {
		
		int talkIndex=1;
		this.a=a;
		
		if (new Main().descV==false) {
			System.out.println("Make sure you have viewed the entire room first.\nEnter [ANY BUTTON] to go back.");
			
			return;
		}
		
		
//		if(a==1) {
//		if(!(desc.equalsIgnoreCase(" "))) {
			
		else {
			System.out.println("Interact with...");
			description(c);
			for(int i=0;i<descArray.length;i++) {
				
				wordSet.add(descArray[i]);
			}
			
			
	        String[] uniqueWords = wordSet.toArray(new String[0]);
		
			for(int i=0;i<uniqueWords.length;i++) {
				
				
				for(int k=0;k<objects.length;k++) {
					
					if(objects[k].equalsIgnoreCase(uniqueWords[i])) {
						
						
							System.out.println(talkIndex+". "+objects[k]);
							talkIndex++;
						
						}	
					}	
				}
			
		}
			
//	}
		
//		else if((desc.equalsIgnoreCase(" "))) {
//			
//			System.out.println("You should probably learn what's in the room first.");
//			
//		}
		
			
		
	
	}
	
	


}
