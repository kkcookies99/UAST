 class Solution {

    Random rand = new Random();

    public List<List<Integer>> XXX(int[] nums) {
        quickSort(nums, 0, nums.length-1);

        List<List<Integer>> resList = new ArrayList<>();
        List<Integer> tmpList = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) return resList;
            if (set.contains(nums[i])) continue;
            set.add(nums[i]);

            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] > 0) r--;
                else if (nums[i] + nums[l] + nums[r] < 0) l++;
                else {
                    tmpList.add(nums[i]);
                    tmpList.add(nums[l]);
                    tmpList.add(nums[r]);
                    resList.add(new ArrayList<>(tmpList));
                    tmpList.clear();

                    while (l+1 < nums.length && nums[l+1]==nums[l]) l++;
                    while (r-1 >= 0 && nums[r-1]==nums[r]) r--;
                    l++;
                }
            }
        }
        return resList;
    }

    private void quickSort(int[] nums, int i, int j) {
        if (j<=i) return;
        int l = i;
        int r = j;

        int randInt = rand.nextInt(j - i + 1) + i;
        int temp = nums[randInt];
        nums[randInt] = nums[i];
        nums[i] = temp;

        temp = nums[i];
        while (i < j) {
            while (i < j && nums[j] > temp) j--;
            if (i < j) nums[i++] = nums[j];
            while (i < j && nums[i] < temp) i++;
            if (i < j) nums[j--] = nums[i];
        }
        nums[i] = temp;

        quickSort(nums, l, i - 1);
        quickSort(nums, i + 1, r);
    }
}```

