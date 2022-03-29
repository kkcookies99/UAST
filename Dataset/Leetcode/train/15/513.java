     public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int k = nums.length - 1;
                for (int j = i + 1; j < nums.length; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        while (k > j && nums[i] + nums[j] + nums[k] > 0) {
                            k--;
                        }
                        if (j == k) break;
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            lists.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        }
                    }
                }
            }
        }

        return lists;
    }

