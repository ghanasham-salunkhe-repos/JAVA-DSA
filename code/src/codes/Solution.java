package codes;

import java.util.logging.Logger;
import java.util.logging.Level;

class Solution {
    private static final Logger LOG = Logger.getLogger(Solution.class.getName());

    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        LOG.log(Level.INFO, "Start processing array length={0}", nums.length);
        LOG.log(Level.INFO, "Init currentSum={0}, maxSum={1}", new Object[]{currentSum, maxSum});

        for (int i = 1; i < nums.length; i++) {
            int prevCurrent = currentSum;
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            if (currentSum != prevCurrent) {
                LOG.log(Level.FINE, "Updated currentSum at index {0}: chose max({1}, {2}) = {3}",
                        new Object[]{i, nums[i], prevCurrent + nums[i], currentSum});
            }
            if (currentSum > maxSum) {
                int prevMax = maxSum;
                maxSum = currentSum;
                LOG.log(Level.INFO, "New maxSum={0} (prev {1}) at index {2}", new Object[]{maxSum, prevMax, i});
            } else {
                LOG.log(Level.FINE, "No max update at index {0}, currentSum={1}, maxSum={2}",
                        new Object[]{i, currentSum, maxSum});
            }
        }
        LOG.log(Level.INFO, "Finished. Result maxSubArray={0}", maxSum);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        Solution s = new Solution();
        int ans = s.maxSubArray(input);
        LOG.log(Level.INFO, "Final answer for input is {0}", ans);
    }
}