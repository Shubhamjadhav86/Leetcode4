class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        if (nums.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[index] = nums[i];
                    index++;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int updatedValue = sol.removeElement(nums, val);
        System.out.println("Updated value: " + updatedValue);

        System.out.print("Updated array: ");
        for (int i = 0; i < updatedValue; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
