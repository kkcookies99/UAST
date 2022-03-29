 class Solution {
    public int XXX(int[] nums, int target) {
        int head = 0;
        int rear = nums.length - 1;
        int mid = rear / 2;
        while (head <= rear) {
            if (nums[mid] == target)
                return mid;
            if (nums[mid] >= target) {
                rear = mid - 1;
                mid = (rear + head) / 2;
            } else {
                head = mid + 1;
                mid = (rear + head) / 2;
            }
        }
        return head;
    }
}

