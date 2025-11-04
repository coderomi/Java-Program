
 class EvenNumbersRecursion{
    public static void main(String[] args) {
        findEvenNumber(1,100);
    }
    public static int findEvenNumber(int start , int end)
    {
        if(start%2==0)
            System.out.println(start+" ");
       start++;
       if(start>end)
           return;
       findEvenNumber(start,end);
   }}
