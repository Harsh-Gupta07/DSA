class Solution {
    public void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = arr[left];
            arr[left] = arr[right];
            arr[right] = mid;
            left++;
            right--;
        }
    }
}
