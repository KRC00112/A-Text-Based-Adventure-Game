package roughTest;

import java.io.IOException;

public class GradualGenerationOfText  {
	
	static int i;

    public static void gradualPrint(String text, long delay) throws IOException {
        for (i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (System.in.available() > 0 && System.in.read() == '\n') {
                System.out.print(text.substring(i + 1)); // Print the remaining text
                return;
                
            }
            
        }
        
        
    }

    public static void main(String[] args) throws IOException {
        String text = "The shimmering moon cast its ethereal "
        		+ "glow upon the tranquil waters of the midnight "
        		+ "lake, where whispers of forgotten tales danced "
        		+ "among the ripples, weaving secrets into the "
        		+ "tapestry of the night. Shadows, like silent "
        		+ "sentinels, embraced the solitude, while the "
        		+ "stars above whispered lullabies to the dreaming "
        		+ "world below, painting the canvas of the universe "
        		+ "with celestial hues of wonder and mystery.";
        
        long delay = 100; // Adjust the delay (in milliseconds) to control the speed of printing

        gradualPrint(text, delay);
        
       
        
    }
}