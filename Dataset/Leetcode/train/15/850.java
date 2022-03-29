 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        quickSort(nums, 0, nums.length - 1);

        Set<List<Integer>> arr = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length-1; j++) {
                int target = -(nums[i] + nums[j]);
                int index = binarySearch(nums, target, j+1, nums.length - 1);
                if (index != -1) {
                    addNewElement(arr, nums[i], nums[j], nums[index]);
                }
            }
        }

        return new ArrayList<>(arr);
    }

    public static void quickSort(int[] nums, int left, int right) {

        if (left >= right) {
            return;
        }

        int pIndex = partition(nums, left, right);
        quickSort(nums, left, pIndex - 1);
        quickSort(nums, pIndex + 1, right);
    }

    private static int partition(int[] nums, int left, int right) {

        int pivot = left;
        int pIndex = pivot + 1;

        for (int i = pIndex; i <= right; i++) {
            if (nums[i] < nums[pivot]) {
                swap(nums, i, pIndex);
                pIndex++;
            }
        }
        swap(nums, pivot, pIndex - 1);

        return pIndex - 1;

    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        int l = low;
        int h = high;

        while (l <= h) {
            int mid = (h + l) / 2;
            if (arr[mid] > target) {
                h = mid - 1;

            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    private void addNewElement(Set<List<Integer>> arr, int num, int num1, int num2) {

        List<Integer> a = new ArrayList<>();
        a.add(num);
        a.add(num1);
        a.add(num2);
        arr.add(a);
    }
}

