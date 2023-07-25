import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {
//methods:
    public static int min(int[] values) {
        int minValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }

    public static int occurrenceScan(int[] values, int target) {
        int count = 0;
        for (int num : values) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int num : values) {
            sum += num;
        }
        return sum;
    }

    public static boolean contains(int[] values, int target) {
        for (int num : values) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dataPoints = new int[100];
        System.out.println("Enter a number between 1 and 100: ");
        int user = SafeInput.getRangedInt(scan, "", 1, 100);


        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }


        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i != dataPoints.length - 1) {
                System.out.print(" | ");
            }

            if (dataPoints[i] == user) {
                break;
            }
        }


        int sum = sum(dataPoints);


        int count = occurrenceScan(dataPoints, user);

        //  min and max values
        int minValue = min(dataPoints);
        int maxValue = max(dataPoints);

      //sout printed
        System.out.println("");
        System.out.println("The sum of the values in dataPoints is: " + sum);
        System.out.println("The average of the values in dataPoints is: " + (double) sum / dataPoints.length);
        System.out.println("Your Number appeared this many times: " + count);
        System.out.println("The minimum value was " + minValue + ", and it appeared " + occurrenceScan(dataPoints, minValue) + " times.");
        System.out.println("The maximum value was " + maxValue + ", and it appeared " + occurrenceScan(dataPoints, maxValue) + " times.");
        System.out.println("The dataPoints array contains the number " + user + ": " + contains(dataPoints, user));
    }
}




