public class Function {

    // What are Function?
    // In Java, functions are called methods. A method is a reusable block of code
    // that only runs when it is called. You can pass data (parameters) into it, and
    // it can return data as a result.

    // How Function Work in Memory?
    // 1. The Stack: Where Functions Live and Die
    // --> Every time you call a method, Java allocates a temporary block of memory
    // called a Stack Frame at the top of the Call Stack.
    // C --> reation: When a method is called, its Stack Frame is created. It stores
    // the method's local variables and primitive data types (like int, boolean).
    // --> Destruction: As soon as the method encounters a return statement or
    // reaches its closing brace }, its Stack Frame is completely erased from
    // memory.
    // --> Structure: It operates as LIFO (Last In, First Out). The currently
    // executing function is always at the very top.

    // 2. The Heap: Where Objects Live
    // --> The Heap is a large, shared memory pool. If your function creates an
    // object (using the new keyword), that object is stored on the Heap, not the
    // Stack.
    // --> The Link: The function's Stack Frame only stores a tiny reference (memory
    // address) that points to the actual object sitting over on the Heap.

    // we can define global variable inside static func?
    // --> No, you cannot define a global variable (or any static variable) inside
    // any function or method in Java, whether it is static or non-static.

    public static void main(String[] args) {
        // System.out.println(Add(23, 12, 2));
        // System.out.println(isPrime(8));
        // System.out.println(Area(12));
        // System.out.println(CeltoFar(32));
        // Add(2, 3);
        // Add(2);
        // PrintName();
        System.out.println(sumof(1, 10));
        nCrandnPr();
        System.out.println(checkevenat2(132344));
    }

    public static int sumof(int start, int end) {
        int sum = 0;
        while (start <= end) {
            if (start % 2 == 0) {
                sum += start;
            }
            start++;
        }
        return sum;
    }

    public static int Add(int a, int b, int c) {
        return a + b + c;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double Area(float radius) {
        return 3.142 * radius * radius;
    }

    public static Double CeltoFar(float Cel) {
        return (1.8 * Cel) + 32;
    }

    public static void Swap() {

    }

    // What is Function Overloading?
    // --> Function overloading is a feature in Java that allows you to define
    // multiple
    // methods with the same name but different parameters.
    // EXAMPLE:-

    // public static void main(String[] args) {
    // Add(2,3);
    // Add(2);
    // }

    public static void Add(int a) {
        System.out.println("Add" + a);
    }

    public static void Add(int a, int b) {
        System.out.println("Add" + a + b);
    }

    // What is Overriding?
    // --> Function Overriding is a feature in JAVA that allow name is same of
    // function
    // but the behavior is different.

    // Example

    // Class A{

    // public void show(){
    // System.out.println("A");
    // }
    // }
    // Class B extends A{
    // @Override
    // public void show(){
    // System.out.println("B");
    // }
    // }

    // What is Static Function?
    // --> Static function is a function that is not associated with any object.

    // Call by Value and Call by Reference

    // Recursion
    // --> Recursion is a feature in JAVA that allow a function to call itself.
    // EXAMPLE:-

    // public static int factorial(int n) {
    // if (n == 0 || n == 1) {
    // return 1;
    // }
    // return n * factorial(n-1);
    // }
    public static void PrintName() {
        int a = 10;
        while (true) {
            if (a == 8)
                return;
            System.out.println(a + "Khush");
            a--;
        }
    }

    public static int Fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * Fact(n - 1);
    }

    public static void nCrandnPr() {
        int n = 4;
        int r = 2;
        int nCr = Fact(n) / (Fact(r) * Fact(n - r));
        int nPr = Fact(n) / Fact(n - r);
        System.out.println("nCr : " + nCr + " nPr : " + nPr);
    }

    public static boolean checkevenat2(int N) {
        int count = 0;
        int isdigit = 1;
        while (count != isdigit) {
            count++;
            N /= 10;
        }
        return (N % 10) % 2 == 0;
    }
}
