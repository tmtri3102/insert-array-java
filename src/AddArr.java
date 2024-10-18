import java.util.Arrays;
import java.util.Scanner;

public class AddArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] newArr = new int[arr.length + 1];
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter index: ");
        int index = input.nextInt();
        System.out.print("Change to: ");
        int value = input.nextInt();

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = value;

        System.out.println("After changing: ");
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));

    }

}
