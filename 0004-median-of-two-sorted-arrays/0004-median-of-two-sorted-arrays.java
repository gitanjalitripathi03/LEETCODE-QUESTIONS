class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        

         int n1 = nums1.length;
        int n2 = nums2.length;
        
        // total elements count
        int total = n1 + n2;
        
        // median tak pahunchne ke liye index
        int mid1 = total / 2;
        
        int i = 0, j = 0;  // pointers for both arrays
        int count = 0;     // kitne elements process kiye
        
        int curr = 0;  // current element
        int prev = 0;  // previous element (even case ke liye)
        
        // bas tab tak chalo jab tak median index tak na pahunch jaaye
        while (count <= mid1) {
            
            prev = curr; // last element yaad rakhna hai
            
            // ab decide karna hai next chhota element kaunsa hai
            if (i < n1 && (j >= n2 || nums1[i] < nums2[j])) {
                curr = nums1[i++];   // nums1 se le liya
            } else {
                curr = nums2[j++];   // nums2 se le liya
            }
            
            count++;
        }
        
        // agar total odd hai → seedha current hi answer
        if (total % 2 == 1) {
            return curr;
        }
        
        // agar even hai → last 2 elements ka average
        return (curr + prev) / 2.0;
    }
}