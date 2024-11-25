package com.example.booksmanagementsystem.test;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

    }


    public static int maxSubArray(int[] nums) {
        int ans = 0;
        int sum = -0x3f3f3f3f;

        ArrayList<Integer> alist = new ArrayList<>(nums.length * );
        for (int i = 1; i <= nums.length; i++) {

            alist.set(i, nums[i - 1]);
            alist.set(i, Math.max(alist.get(i), alist.get(i - 1) + nums[i - 1]));
            ans = Math.max(ans, alist.get(i));
        }

        return ans;

    }
}

