package roughTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashAndWhatever {
	
    	static String[] people= {"michael","richard","kevin","sarah","Joey","garnt"};
	
	 	static String[] objects= {"pen","drugs","television"};
	 	
	 	
	
	static String para= "In the heart of the bustling city ,"
			+ "\nKing Richard sat on his majestic throne ,"
			+ "\ncontemplating the intricacies of his realm"
			+ "\nwith a thoughtful expression . joey Beside him ,"
			+ "\nhis trusted advisor Michael handed him a"
			+ "\npen , urging him to sign a decree that would"
			+ "\nshape the fate of the kingdom . Meanwhile ,"
			+ "\nin a nearby apartment , Kevin was engrossed"
			+ "\nin a late-night television show , flipping"
			+ "\nchannels to find something captivating ."
			+ "\nLittle did he know that across town , a"
			+ "\nmysterious figure was plotting to smuggle"
			+ "\nillegal drugs into the city , disrupting the"
			+ "\npeace that King Richard sought to maintain ."
			+ "\nThe city's fate hung in the balance , as the"
			+ "\npaths of these seemingly unrelated characters"
			+ "\nconverged in a tale of intrigue and destiny sarah . michael kevin richard pen . garnt Garnt";
	
	
	static String paraLower=para.toLowerCase();
	
	static String[] paraArray=paraLower.split(" ");
	
	static Set<String> wordSet=new HashSet<>();
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner=new Scanner(System.in);

		
		System.out.println(para);
		System.out.println();
		while(true) {
			


			System.out.print("what would like to do: ");
			String action=scanner.nextLine();
			System.out.println();
			
			if(action.equalsIgnoreCase("talk")) {
				talk();
			
			}
			
			System.out.println();
			
			if(action.equalsIgnoreCase("use")) {
			
				use();
			
			}
			System.out.println();
			
		}
	}
	public static void talk() {
		
		for(int i=0;i<paraArray.length;i++) {
			
			wordSet.add(paraArray[i]);
		}
		
		
        String[] uniqueWords = wordSet.toArray(new String[0]);
	
		for(int i=0;i<uniqueWords.length;i++) {
			
			
			for(int k=0;k<people.length;k++) {
				
				if(people[k].equalsIgnoreCase(uniqueWords[i])) {
					
					
						System.out.println("talk to "+people[k].substring(0, 1).toUpperCase()+""+people[k].substring(1,people[k].length()));
						
					
					}	
				}	
			}
			
		}
	
	public static void use() {
		
		for(int i=0;i<paraArray.length;i++) {
			
			wordSet.add(paraArray[i]);

		
		}
		
		String[] uniqueWords = wordSet.toArray(new String[0]);

		for(int i=0;i<uniqueWords.length;i++) {
			
			
			for(int k=0;k<objects.length;k++) {
				
				if(objects[k].equalsIgnoreCase(uniqueWords[i])) {
					
					
						System.out.println("use "+objects[k]);
						
					
					}	
				}	
			}
			
		}
	
	
}


