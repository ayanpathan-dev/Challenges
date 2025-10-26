import java.util.*;

public class BasicJavaTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1️⃣ Longest string length
        String[] arr = {"apple", "banana", "kiwi"};
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLength) {
                maxLength = arr[i].length();
            }
        }
        System.out.println("Longest string length: " + maxLength);

        // 2️⃣ Reverse number
        int n = 1200;
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reversed number: " + reversed);

        // 3️⃣ Find missing number
        int[] nums = {3, 0, 1};
        int sum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        int missing = sum - actualSum;
        System.out.println("Missing number: " + missing);

        // 4️⃣ Rotate array
        int[] numsToRotate = {1, 2, 3, 4, 5};
        int k = 2;
        int nRotate = numsToRotate.length;
        k = k % nRotate;
        int[] rotated = new int[nRotate];
        for (int i = 0; i < nRotate; i++) {
            rotated[(i + k) % nRotate] = numsToRotate[i];
        }
        System.out.print("Rotated array: ");
        for (int i = 0; i < nRotate; i++) {
            System.out.print(rotated[i] + " ");
        }
        System.out.println();

        // 5️⃣ Merge sorted arrays
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, m = 0;
        for (; i < nums1.length && j < nums2.length;) {
            if (nums1[i] < nums2[j]) {
                merged[m++] = nums1[i++];
            } else {
                merged[m++] = nums2[j++];
            }
        }
        for (; i < nums1.length; i++) merged[m++] = nums1[i];
        for (; j < nums2.length; j++) merged[m++] = nums2[j];
        System.out.print("Merged array: ");
        for (int val : merged) System.out.print(val + " ");
        System.out.println();

        // 6️⃣ Check alphanumeric
        String str = "Hello123";
        boolean isAlnum = true;
        for (int idx = 0; idx < str.length(); idx++) {
            char c = str.charAt(idx);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                isAlnum = false;
                break;
            }
        }
        System.out.println("Is alphanumeric? " + isAlnum);

        sc.close();
    }
}