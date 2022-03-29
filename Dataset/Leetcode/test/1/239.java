 class Solution {
    public int[] XXX(int[] nums, int target) {
        Integer[] sort = sort(nums);
        int[] ints = get(nums, target, 0, nums.length - 1);
        int index1 = sort[ints[0]] == null ? ints[0] : sort[ints[0]];
        int index2 = sort[ints[1]] == null ? ints[1] : sort[ints[1]];
        return new int[]{index1, index2};
    }

    public  int[] get(int[] nums, int target, int s, int e) {
        if (nums[s] + nums[e] == target) {
            return new int[]{s, e};
        } else if (nums[s] + nums[e] < target) {
           return get(nums, target, s + 1, e);
        } else {
           return get(nums, target, s, e - 1);
        }
    }

    public static Integer[] sort(int[] nums) {
        Integer[] index = new Integer[nums.length];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    nums[j] = nums[j] ^ nums[j + 1];
                    nums[j + 1] = nums[j] ^ nums[j + 1];
                    nums[j] = nums[j] ^ nums[j + 1];

                    if (index[j] == null) {
                        index[j] = j;
                    }
                    if (index[j + 1] == null) {
                        index[j + 1] = j + 1;
                    }
                    index[j] = index[j] ^ index[j + 1];
                    index[j + 1] = index[j] ^ index[j + 1];
                    index[j] = index[j] ^ index[j + 1];
                }
            }
        }

        return index;
    }
}

