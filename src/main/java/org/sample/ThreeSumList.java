package org.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumList {
    private List<List<Integer>> res;
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return Collections.emptyList();
        Arrays.sort(nums);
        int l, r, sum;
        final Set<List<Integer>> tempRes = new HashSet<>();
        for (int i = 0; i < nums.length - 2; ++i) {
            l = i + 1;
            r = nums.length - 1;
            while (l < r) {
                sum = nums[i] + nums[l] + nums[r];
                if (sum == 0)
                    tempRes.add(Arrays.asList(nums[i], nums[l], nums[r]));
                if (sum < 0)
                    ++l;
                else
                    --r;
            }
        }
        res = new ArrayList<>(tempRes);
        return res;
    }
}
