 class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Handle edge case: empty array.
        
        int j = 1; // Pointer to track the position for unique elements.
        for (int i = 1; i < nums.length; i++) { // Start from the second element.
            if (nums[i] != nums[i - 1]) { // Check if the current element is different from the previous one.
                nums[j] = nums[i]; // Place the unique element at position `j`.
                j++; // Move `j` to the next position.
            }
        }
        return j; // Return the count of unique elements.
    }
}
