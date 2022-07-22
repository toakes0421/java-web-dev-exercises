package exercises.chp3.arraylistpractice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SumEvens {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            nums.add(i);
        };
        int sum = 0;
        for (int i : nums) {
            if (nums.get(i) % 2 ==0) {
                sum += nums.get(i);
            };
        };
        System.out.println(sum);
    }
}
