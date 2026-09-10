class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int length = Math.min(nums1.length, nums2.length);
        int []arr = new int[length];

        int i = 0;
        int j = 0;
        while(i<nums1.length && j<nums2.length){
            
            if(nums1[i] == nums2[j]) return nums1[i];
            else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }


        }
        return -1;
    }
}