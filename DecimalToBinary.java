import java.lang.constant.ClassDesc;
import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int num= sc.nextInt();
//        int dup=num;
//        int rem=0;
//        String bin="";


//        rem=num%2;
//        num=num/2;
//        bin =rem+bin;
//
//        rem=num%2;
//        num=num/2;
//        bin =rem+bin;
//
//        rem=num%2;
//        num=num/2;
//        bin =rem+bin;
//
//        rem=num%2;
//        num=num/2;
//        bin =rem+bin;
//
//        rem=num%2;
//        num=num/2;
//        bin =rem+bin;
//
//        rem=num%2;
//        num=num/2;
//        bin =rem+bin;
//
//        rem=num%2;
//        num=num/2;
//        bin =rem+bin;
//
//        rem=num%2;
//        num=num/2;
//        bin =rem+bin;
      //  Scanner sc=new Scanner(System.in);

        int  num=sc.nextInt();
        String bin="";//empty
        for(int i=num;i!=0;i=i/2){

            bin=(i%2)+bin;
        }

        // System.out.println("dup="+dup);
        System.out.print("binary "+num + " is :-" +bin);
//        System.out.println("dup is "+dup);
//        System.out.println("binary value is "+bin);
    }
}