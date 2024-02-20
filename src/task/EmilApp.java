package task;

import java.util.Scanner;

public class EmilApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] nums = new int[7];
        int[] nums3 = new int[2];
        int [] nums4 = new int[2];
        int sum1 = 0;
        int count = 0;
        for (int i = 0; i < 7; i++) {
            nums[i] = scanner.nextInt();
            while (nums[i] > 0){
                nums[i] /= 10;
                count++;
                }
                if (count == 3){
                    nums3 [i] = nums[i];
            }
        }
    }

}