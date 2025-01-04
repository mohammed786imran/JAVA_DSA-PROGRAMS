 class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0; // Step 1: Handle edge case where x = 0
        int left = 1, right = x; // Step 2: Initialize search range
        while (left <= right) { // Step 3: Start binary search
            int mid = left + (right - left) / 2; // Step 4: Calculate midpoint
            if (mid == x / mid) { // Step 5: Check if mid * mid == x
                return mid; // Return mid if it's the exact square root
            } else if (mid < x / mid) { // Step 6: Check if mid * mid < x
                left = mid + 1; // Move left boundary to the right
            } else { // Step 7: mid * mid > x
                right = mid - 1; // Move right boundary to the left
            }
        }
        return right; // Step 8: Return the integer square root
    }
}
