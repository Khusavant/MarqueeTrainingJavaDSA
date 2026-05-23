import java.util.Scanner;

class Day1 {
    public static void main(String[] args) {
        // int num1 = 22;
        // int num2 = 72;
        // System.out.println(GCF(num1, num2));
        // sumofsqdigit(12131);
        // System.out.println(armstrongno(153));
        // practice();
        // cube();
        // fobonacci();
        // GCD();
        // pattern();
        // System.out.println(divide());
        // triangle();
        // hollowSquare();
        // HollowPyramid();
        stairs();
    }

    public static int GCF(int n1, int n2) {
        int i = 1;
        int HCF = 0;
        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                HCF = i;
            }
            i++;
        }
        return HCF;
    }

    public static void sumofsqdigit(int n) {
        int sum = 0;
        int copy = n;
        while (copy > 0) {
            sum = sum + (copy % 10) * (copy % 10);
            copy /= 10;
        }
        System.out.println(sum);
    }

    public static boolean armstrongno(int n) {
        int res = 0;
        int copy = n;
        while (n > 0) {
            res = res + (n % 10) * (n % 10) * (n % 10);
            n /= 10;
        }
        return res == copy;
    }

    public static void practice() {
        int i = (int) (20 * 0.2);
        while (i * i <= 80) {
            if (i * i > 20) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void cube() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = 1; i <= b / i * i; i++) {
            if (i * i * i >= a && i * i * i <= b) {
                System.out.println(i * i * i);
            }
        }
        s.close();
    }

    public static void fobonacci() {
        int n = 10;
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int temp = a;
            a = b;
            b = a + temp;
        }
    }

    public static void GCD() {
        int max = 60;
        int min = 18;
        while (min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }
        System.out.println(max);
    }

    public static void pattern() {
        int n = 5;
        for (int i = 1; i <= n * 2; i++) {
            if (i <= n) {
                for (int j = i; j > 0; j--) {
                    System.out.print("*" + " ");
                }
            } else {
                for (int j = n * 2 - i; j > 0; j--) {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }

    public static float divide() {
        float a = 10f;
        int b = 20;
        return a / b;
    }

    public static void triangle() {
        int rows = 4;
        for (int i = rows; i >= 1; i--) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void hollowSquare() {
        int rows = 5;
        int cols = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void HollowPyramid() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void stairs() {
        int n = 5;
        int k = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                k += 2;
                for (int j = 0; j < k; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int j = 0; j < k; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
