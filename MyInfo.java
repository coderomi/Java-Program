import java.util.*;

class MyInfo {

    static String name, email;
    static long contactno; 
    static int yop;
    static double cgpa;     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = sc.next();

        System.out.println("Enter your email: ");
        email = sc.next();

        System.out.println("Enter your contact: ");
        contactno = sc.nextLong(); 

        System.out.println("Enter your year of passing (yop): ");
        yop = sc.nextInt();

        System.out.println("Enter your cgpa: ");
        cgpa = sc.nextDouble();

        myinfo(name, email, contactno, yop, cgpa);
    }

    public static void myinfo(String name, String email, long contactno, int yop, double cgpa) {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Contact No: " + contactno);
        System.out.println("Year of Passing: " + yop);
        System.out.println("CGPA: " + cgpa);
    }
}
