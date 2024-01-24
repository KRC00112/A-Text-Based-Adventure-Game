package roughTest;

public class LoadingNumbers {

    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i);
            try {
                // Sleep for a short duration to make the overwriting visible
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Use a backspace character to move the cursor back
            System.out.print("\b");
        }
        System.out.println(); // Move to the next line after the loop
    }
}

