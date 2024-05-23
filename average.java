package Basic;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter any 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            sum += n;
        }

        float average = (float) sum / 10;
        System.out.println("Average of 10 numbers: " + average);
    }
}
