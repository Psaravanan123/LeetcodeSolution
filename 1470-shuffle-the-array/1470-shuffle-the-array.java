class Solution {
    public int[] shuffle(int[] nums, int n) {
        int mid = n;
        int[] arr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            arr[j++] = nums[i];
            arr[j++] = nums[mid++];
        }
        return arr;
    }
}
