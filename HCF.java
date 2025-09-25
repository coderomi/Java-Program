import java.util.Scanner;
class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int smallest = n1 < n2 ? n1 : n2; 

        for (int i = smallest; i >= 1; i--)
         { 
            if (n1 % i == 0 && n2 % i == 0) 
            { 
                System.out.println("The HCF is : " + i);
                break; 
            }
        }
    }
}
