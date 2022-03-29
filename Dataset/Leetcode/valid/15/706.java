 public List<List<Integer>> XXX(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (n < 3||nums == null) return res;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++){
            if (i > 0&&nums[i] == nums[i-1]) continue;
            int target = -nums[i];
            int k = n-1;
            for (int j = i + 1; j < n; j++){
                if (j > i + 1&&nums[j] == nums[j - 1]) continue;
                while (j < k&&nums[j] + nums[k] > target) {
                    k--;
                }
                if (j == k) break;
                if (nums[j] + nums[k] ==target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                }
            }
        }
        return res;
    }

