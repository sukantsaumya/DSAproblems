class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 1; i < n - 1; i++) {
            if (nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            while (j < n && nums[j] == nums[i]) j++;
            if (j < n) {
                if (nums[i] > nums[i - 1] && nums[i] > nums[j]) count++; 
                if (nums[i] < nums[i - 1] && nums[i] < nums[j]) count++; 
            }
        }
        return count;
    }
}
