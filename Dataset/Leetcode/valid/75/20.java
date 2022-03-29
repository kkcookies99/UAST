class Solution {
    public void XXX(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    /**
     * 三分单向扫描
     */
    private void quickSort(int[] nums, int left, int right) {
        int pivot = 1;
        int i = left, j = right, k = left;

        outer:
        while (k <= j) {
            if (nums[k] < pivot) {
                swap(nums, i, k);
                i++;
                k++;
            } else if (nums[k] == pivot) {
                k++;
            } else {
                while (nums[j] > pivot) {
                    j--;
                    if (k > j) {
                        break outer;
                    }
                }

                if (nums[j] < pivot) {
                    swap(nums, k, j);
                    swap(nums, i, k);
                    i++;
                } else {
                    swap(nums, k, j);
                }
                k++;
            }
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

