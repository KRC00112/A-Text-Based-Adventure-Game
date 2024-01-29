package ghostWatcherDiaries;

public class JoeyDialogues {
	

	int num;
	int choice;
	int count;
	
	
	public void questions(int num){
		
		this.num=num;
		
		int i=1;
		
		
		if(this.num==1) {
				
			String[] dlg= {"Who exactly are you?"
							,"Where am I?"
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
				
				System.out.println("I am Joey, you need any help discussing details of the case just come to me.\nBartley doesn't like being bothered by this stuff.  ");
			}
			
			if(choice==2) {
				System.out.println("We are at the Spirit Council.wooooo");
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
