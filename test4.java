import java.util.*;
 
public class test4 {
    public static void printAllCombinations(String nums, int idx, String ans) {
        if (idx == nums.length()) {
            System.out.println(ans);
            return;
        }
        printAllCombinations(nums, idx + 1, ans + Character.toString(nums.charAt(idx)));
        if (idx != nums.length() - 1)
            printAllCombinations(nums, idx + 1, ans + Character.toString(nums.charAt(idx)) + " ");
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.next();
        printAllCombinations(nums, 0, "");
    }
}
 
