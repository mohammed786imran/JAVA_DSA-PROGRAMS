class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0; // Left boundary of the search range
        int right = nums.length - 1; // Right boundary of the search range
        
        while (left <= right) { // Continue searching until the range is valid
            int mid = left + (right - left) / 2; // Avoid overflow by calculating the midpoint this way
            if (nums[mid] == target) {
                return mid; // Return index if target is found
            } else if (nums[mid] < target) {
                left = mid + 1; // Narrow the search to the right half
            } else {
                right = mid - 1; // Narrow the search to the left half
            }
        }
        return left; // Return the insertion position when the loop ends
    }
}

