// import java.util.Scanner;

// class DuckNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number:");
//         int num = sc.nextInt();

//         boolean hasZero = false;
//         int temp = num;

//         // ✅ find first digit
//         int firstDigit = num;
//         while (firstDigit >= 10) {
//             firstDigit /= 10;
//         }

//         // ✅ check other digits
//         while (temp > 0) {
//             int last = temp % 10;
//             if (last == 0) {
//                 hasZero = true;
//                 break;
//             }
//             temp /= 10;
//         }

//         // ✅ final result
//         if (firstDigit == 0) {
//             System.out.println("Not Duck Number......... (starts with zero)");
//         } else if (hasZero) {
//             System.out.println("Duck Number");
//         } else {
//             System.out.println("Not Duck Number");
//         }
//     }
// }

import java.util.Scanner;

class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        String num = sc.next();   // take input as string to keep leading zeros

        boolean hasZero = false;

        // ✅ Step 1: Check if first digit is zero
        if (num.charAt(0) == '0') {
            System.out.println("Not Duck Number......... (starts with zero)");
            return;
        }

        // ✅ Step 2: Use loop to check rest of digits
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                hasZero = true;
                break;
            }
        }

        // ✅ Step 3: Apply rule
        if (hasZero) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not Duck Number");
        }
    }
}
