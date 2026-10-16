class Solution {
    public void moveZeroes(int[] nums) {
        int zero = 0;

        // Step 1: Shift all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[zero] = nums[i];
                zero++;
            }
        }

        // Step 2: Fill the rest of the array with zeroes
        while (zero < nums.length) {
            nums[zero] = 0;
            zero++;
        }
    }
}
