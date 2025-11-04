 class PalindromeRecursion {

    // Recursive method to reverse the number
    public static int reverse(int n, int rev) {
        if (n == 0)
            return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        int num = 121;  // you can change this number
        int reversed = reverse(num, 0);

        if (num == reversed)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is Not a Palindrome");
    }
}
