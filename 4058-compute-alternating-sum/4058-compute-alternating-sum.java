class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];  
            } else {
                sum -= nums[i];  
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 3, 5, 7};
        System.out.println("Alternating sum: " + sol.alternatingSum(nums1)); 
        int[] nums2 = {100};
        System.out.println("Alternating sum: " + sol.alternatingSum(nums2)); 
    }
}
