import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        Boolean done = false;


        int[] dataPoints = new int[100];
        for (int l = 0; l < dataPoints.length; l++)
            dataPoints[l] = gen.nextInt(100) + 1;

        for (int l : dataPoints)
            System.out.printf("|%2d", dataPoints[l], "%2d|");
        System.out.println("");

        int sum = 0;
        for (int l = 0; l < dataPoints.length; l++)
            sum += dataPoints[l];

        System.out.println("\nThe sum of the array value is " + sum);
        System.out.println("The average is " + sum / dataPoints.length);


        int numb = SafeInput.getRangedInt(in, "\n Enter the number you want to find:", 1, 100);
        for(int t=0; t < dataPoints.length; t++) {
            if (dataPoints[t] == numb) {
                dataPoints[numb] += 1;
                done = true;
                System.out.println(numb + " was found " + dataPoints[numb] + " times in the array.");
            }
        }
            if(!done){
                System.out.println(numb + " was not found in the array.");
            }

        done=false;

        SafeInput.getRangedInt(in, "\n Enter the number you want to find:", 1, 100);
        for(int t=0; t < dataPoints.length; t++) {
            if (dataPoints[t] == numb) {
                done = true;
            }
            if(done=true)
                System.out.println("Number " + numb + " found at array index " + dataPoints[t]);
                break;
        }

            System.out.println("Search Finished.");
            if (!done) {
                System.out.println("Your number was not found within the array.");
            }





    }
}