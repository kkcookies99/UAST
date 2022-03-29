 public List<List<Integer>> XXX(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return list;
        }
        Arrays.sort(nums);
        int numsLen = nums.length;
        for (int i = 0; i < numsLen; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int L = i + 1;
            int R = numsLen - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum < 0) {
                    L++;
                }else if (sum > 0) {
                    R--;
                }else {
                    list.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while(L < R && nums[L] == nums[L+1]) L++;
                    while(L < R && nums[R] == nums[R-1]) R--;
                    L++;
                    R--;
                }
            }
        }
        return list;
    }

