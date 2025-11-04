// class Example2 {
//     public static void main(String[] args) {
//         printNumber(0);
//     }

//     public static void printNumber(int num) {
//         if (num >= 10) return;
//         printNumber(++num);
//         System.out.println(num + " ");
//     }
// }

class Example2 {
    public static void main(String[] args) {
        System.out.println("starts");
        printNumber(1);
        System.out.println("ends");
    }

    public static void printNumber(int num) {
        System.out.println(num + " ");
        if (num >= 3) 
            return;
        printNumber(++num);
        System.out.println("hello");
    }
}

