class NumberToWord{
   public static void main(String[]args){
      System.out.print("Enter a number:- ");
      int num=new java.util.Scanner(System.in).nextInt();
      convertNumberToWords(num);
   }
    // logic first
   // public static void convertNumberToWords(int num){
   //    String words=" ";
   //    int temp=num;
   //    while(num>0){
   //       int rem=num%10;
   //       switch(rem){
   //          case 0:words="Zero "+words;break;
   //          case 1:words="One "+words;break;
   //          case 2:words="Two "+words;break;
   //          case 3:words="Three "+words;break;
   //          case 4:words="Four "+words;break;
   //          case 5:words="Five "+words;break;
   //          case 6:words="Six "+words;break;
   //          case 7:words="Seven "+words;break;
   //          case 8:words="Eight "+words;break;
   //          case 9:words="Nine "+words;break;


   //       }
   //       num/=10;
   //    }

   //    System.out.println(temp +" : "+words);
   // }
   

   // logic second
    public static void convertNumberToWords(int num){
      String words=" ";
      int temp=num;
      boolean assump=true;
      if(num<0){
         assump=false;
         num=num*-1;
      }
      if(num==0){
         
         words="ZERO";

      }
      while(num!=0){
         int rem=num%10;
       words= switch(rem){
            case 0->"Zero "+words;
            case 1->"One "+words;
            case 2->"Two "+words;
            case 3->"Three "+words;
            case 4->"Four "+words;
            case 5->"Five "+words;
            case 6->"Six "+words;
            case 7->"Seven "+words;
            case 8->"Eight "+words;
            case 9->"Nine "+words;
            default->" "+words;


         };
         num/=10;
      }
        if(assump==false){
         words="MINUS "+words;
        }
      System.out.println(temp +" : "+words);
   }
}