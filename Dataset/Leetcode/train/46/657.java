 public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length == 0) return ans;
        backTrack(nums, new ArrayList<Integer>(), ans);
        return ans;
    }

public void backTrack(int[] nums, List<Integer> list, List<List<Integer>> ans) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            backTrack(nums, list, ans);
        }
        if (list.size() != 0) {
            list.remove(list.size() - 1);
        }
    }

