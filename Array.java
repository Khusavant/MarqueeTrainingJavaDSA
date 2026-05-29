import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // printarr();
        int[] arr = { 1, 2, 3, 5 };
        int[] arr1 = { 1, 2, 3 };
        Sub(arr, arr1);
        // count(arr, 5);
        // SumofArray(arr, arr);
        // SumofEachElement(arr);
        // CountDouble(arr);
        // System.out.println(LinearSearch(arr, 10));

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

    // You have been given an array arr that might contain duplicate elements. Your
    // task is to find the maximum possible distance between occurrences of two
    // repeating elements i.e. elements having the same value. If there are no
    // duplicate elements in the array, print 0"

    public static void CountDouble(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if ((i - j) < max) {
                        max = i - j;
                    }
                }
            }
        }
        if (max < 0)
            max *= -1;
        System.out.println(max);
    }

    public static void count(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x)
                count++;
        }
        System.out.println(count);
    }

    // Given two array of similar size , run a single loop and return a array which
    // is summation of same index element, 0 <= element < 5

    public static void SumofArray(int[] a, int[] b) {
        int[] Sumof = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if ((a[i] + b[i]) < 5 && (a[i] + b[i]) >= 0) {
                Sumof[i] = a[i] + b[i];
            } else {
                Sumof[i] = 0;
            }
        }
        for (int i : Sumof) {
            System.out.print(i + " ");
        }
    }

    public static void SumofEachElement(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = sum - a[i];
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    // HW
    public static void Sub(int[] a, int[] b) {
        int n = a.length; // [1,2,1]
        int m = b.length;// [2,3]

        if (n > m) {
            int[] res = new int[n];
            int borrow = 0;
            for (int i = n - 1; i > m; i--) {
                if (a[i] < b[i - m - 1]) {
                    borrow = a[i] + 10;
                    a[i - 1] -= 1;
                    res[i] = borrow - b[i];
                } else {
                    res[i] = a[i] - b[i - m];
                }
            }
            for (int i : res) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("It is in minus");
        }
    }
}
