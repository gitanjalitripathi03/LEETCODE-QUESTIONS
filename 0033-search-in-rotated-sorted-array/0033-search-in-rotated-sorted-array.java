class Solution {
    public int search(int[] arr, int target) {
        int start = 0;
 int end = arr.length - 1;
 while (start <= end) {
 int middle = start + (end - start) / 2;
 if (arr[middle] == target) {
 return middle;
 }
 if (arr[start] <= arr[middle]) {
 if (target >= arr[start] && target < arr[middle]) {
 end = middle - 1;
 } else {
 start = middle + 1;
 }
 } else {
 if (target > arr[middle] && target <= arr[end]) {
 start = middle + 1;
 } else {
 end = middle - 1;
 }
 }
 }
 return -1;

    }
}