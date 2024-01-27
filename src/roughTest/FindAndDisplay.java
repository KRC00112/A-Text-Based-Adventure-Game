package roughTest;

import java.util.Scanner;

public class FindAndDisplay {
	
	
	static String para= "In the heart of the bustling city, "
			+ "\nKing Richard sat on his majestic throne, "
			+ "\ncontemplating the intricacies of his realm"
			+ "\nwith a thoughtful expression. Beside him, "
			+ "\nhis trusted advisor Michael handed him a "
			+ "\npen , urging him to sign a decree that would "
			+ "\nshape the fate of the kingdom. Meanwhile, "
			+ "\nin a nearby apartment, Kevin was engrossed "
			+ "\nin a late-night television show, flipping "
			+ "\nchannels to find something captivating. "
			+ "\nLittle did he know that across town, a "
			+ "\nmysterious figure was plotting to smuggle "
			+ "\nillegal drugs into the city, disrupting the "
			+ "\npeace that King Richard sought to maintain. "
			+ "\nThe city's fate hung in the balance, as the "
			+ "\npaths of these seemingly unrelated characters "
			+ "\nconverged in a tale of intrigue and destiny sarah . michael kevin richard pen  ";
	
	static String [] paraArray=para.split(" ");
	
	static String[] words= {"pen","king","drugs","television","michael","kevin","sarah"};
	
	static String[] people= {"michael","richard","kevin","sarah"};
	
	static String[] objects= {"pen","drugs","television"};
	
	static int characterAppearanceCountLimit=people.length;
	static int characterAppearanceCount=0;
	
	static int objectAppearanceCountLimit=objects.length;
	static int objectAppearanceCount=0;

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scanner=new Scanner(System.in);

		
		System.out.println(para);
		System.out.println();
		
	while(true) {
		characterAppearanceCount = 0;
		objectAppearanceCount=0;


		System.out.print("what would like to do: ");
		String action=scanner.nextLine();
		System.out.println();
		
		if(action.equalsIgnoreCase("talk")) {
			talk();
		
		}
		
		System.out.println();
		
		if(action.equalsIgnoreCase("inventory")) {
		
			inventory();
		
		}
		System.out.println();
		
	}
		
		
		
		
		
		

	}
	public static void talk() {
		
		for(int i=0;i<paraArray.length;i++) {
			
			
			for(int k=0;k<people.length;k++) {
				
				if(people[k].equalsIgnoreCase(paraArray[i])) {
					
					if(characterAppearanceCount<characterAppearanceCountLimit) {
					
						System.out.println("talk to "+people[k]);
						
						characterAppearanceCount++;
					
					}
					
					
				}
				
			}
			
			
			
			
		}
		
		
	}
	public static void inventory() {
		
		for(int i=0;i<paraArray.length;i++) {
			

			
			for(int k=0;k<objects.length;k++) {
				
				if(objects[k].equalsIgnoreCase(paraArray[i])) {
					
					if(objectAppearanceCount<objectAppearanceCountLimit) {

					
						System.out.println("use "+objects[k]);
						
						objectAppearanceCount++;
						
					}
					
					
				}
				
			}
			
			
			
			
		}
		
	}
	
	

}
