import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        printarr();
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(LinearSearch(arr, 10));

    }

    public static void printarr() {
        Scanner s = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextInt();
            System.out.print("arr :");
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        System.out.println("Base Address of arr:" + arr); // it will print base address
    }

    // Linear Search

    public static boolean LinearSearch(int[] arr, int target) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Binary Searcg
}
