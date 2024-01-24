package ghostWatcherDiaries;

public class BartleyDialogues {
	
	
	int num;
	int choice;
	int count;
	
	
	public void questions(int num){
		
		this.num=num;
		
		int i=1;
		
		
		if(this.num==1) {
				
			String[] dlg= {"Who exactly are you?"
							,"Where am I?"
							,"what are these documents about?"
							,"What do you mean \"trial\"?"
							,"[EXIT]"};
			
			
			for(String s:dlg) {
				
				System.out.println(i+". "+s);
				i++;
				
			}
			
			count=i;
			
	
		}
		
		if(this.num==2) {
			
			String[] dlg= {"something else"
							,"something else"
							,"something else"
							,"something else"
							,"something else"};
			
			
			for(String s:dlg) {
				
				System.out.println(i+". "+s);
				i++;
				
			}
			
	
		}
		
	
	}
	
	
	public void answers(int num,int choice) {
		
	
		this.choice=choice;
		
		if(num==1) {

			if(choice==1) {
				
				System.out.println("As i said I am bartley.");
			}
			
			if(choice==2) {
				System.out.println("We are at the office.");
			}
			if(choice==3) {
				System.out.println("Your personal details");
			}
			if(choice==4) {
				System.out.println("You dont know about the trials? ");
			}
				
			
			
		}
		if(num==2) {
			
			if(choice==1) {
				System.out.println("i am something else");
			}
			
			if(choice==2) {
				System.out.println("we are at someplace else");
			}
			
			
		}
		
	}
	

}
