import java.util.Scanner;

public class ThirdLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int first = a[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 1; i < 5; i++) {

            if (a[i] > first) {
                third = second;
                second = first;
                first = a[i];
            } 
            else if (a[i] > second && a[i] != first) {
                third = second;
                second = a[i];
            } 
            else if (a[i] > third && a[i] != second && a[i] != first) {
                third = a[i];
            }
        }

        System.out.println("Third largest number = " + third);
    }
}
