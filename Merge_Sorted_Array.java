/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two 
  integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside 
  the array nums1. To accommodate this, nums1 has a length of m + n, where the first m 
  elements denote the elements that should be merged, and the last n elements are set to 
  0 and should be ignored. nums2 has a length of n.
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[nums1.length];
        int size = 0;
        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
        }
        size = m-n;
        int i = 0;
        int j = 0;
        while (i+j < m+n) {
            if (i>=m) {
                nums1[i+j] = nums2[j];
                j += 1;
            }
            else if (j>=n) {
                nums1[i+j] = nums3[i];
                i += 1;
            } else if (nums3[i] < nums2[j]) {
                nums1[i+j] = nums3[i];
                i += 1;
            } else {
                nums1[i+j] = nums2[j];
                j += 1;
            }
        }
    }
}

// time complexity: O(n+m)
// space complexity: O(m)
