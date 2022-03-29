class Solution {
    public void XXX(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void sort(int[] arr, int l, int r) {
        if (l >= r)
            return;

        swap(arr, l, l + (r - l) / 2);
        int i = l + 1, lt = l, gt = r + 1;
        while (i < gt) {
            if (arr[i] < arr[l]) {
                lt++;
                swap(arr, i, lt);
                i++;
            } else if (arr[i] > arr[l]) {
                gt--;
                swap(arr, i, gt);
            } else {
                i++;
            }
        }
        swap(arr, l, lt);
        sort(arr, l, lt - 1);
        sort(arr, gt, r);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

