import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        boolean done = false;
        int tempToConvert = 0;
        int FTemp;
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter a temperature in C to convert to F: ");
            if (in.hasNextInt())
            {
                tempToConvert = in.nextInt();
                FTemp = tempToConvert * 9/5 + 32;
                System.out.println(tempToConvert + " degrees C is the same as " + FTemp + " degrees F.");
                done = true;
            }
            else
            {
                System.out.println(tempToConvert + " is not a valid integer. Please try again.");
            }
            //tempToConvert = in.nextInt();

           // if (tempToConvert.hasNextInt()){
            //    tempToConvert = Scanner.nextInt();
          //  }


        } while (!done);
    }

}
