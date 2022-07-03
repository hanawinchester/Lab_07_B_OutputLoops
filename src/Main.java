import java.util.Scanner;

public class Main
{
    static String rowOne = "";
    public static void main(String[] args)
    {
        for (int col=0; col<=4; col++)
        {
            rowOne = rowOne + "*";
            System.out.println(rowOne);
        }

        System.out.println("\r\n");

        //Reversed
        for (int col=4; col>=0; col--)
        {
            for (int repeat=0; repeat<=col; repeat++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\r\n");

        //Block
        for (int col=0; col<=4; col++)
        {
            System.out.println("*****");
        }

        System.out.println("\r\n");

        //EXTRA CREDIT INITIAL (H)
        for ( int col=0; col<=4; col++)
        {
            System.out.println("***     ***");
        }
        for ( int col=0; col<=1; col++)
        {
            System.out.println("***********");
        }
        for ( int col=0; col<=4; col++)
        {
            System.out.println("***     ***");
        }

    }

}


