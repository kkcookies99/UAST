class Solution {
    public boolean XXX(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        List<Integer> zeroList = new LinkedList<>();
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroList.add(count);
            }
            count++;
        }
        if (zeroList.isEmpty() || zeroList.get(0) == nums.length - 1) {
            return true;
        } else if (zeroList.get(0) == 0) {
            return false;
        }
        int start = 0;
        int jumpMax = 0;
        for (int end : zeroList) {
            if (jumpMax >= nums.length - 1) {
                return true;
            } else if (jumpMax > end) {
                continue;
            }
            boolean skipZero = false;
            for (int i = start; i < end; i++) {
                if (nums[i] + i > jumpMax) {
                    jumpMax = nums[i] + i;
                }
                if (nums[i] + i > end) {
                    skipZero = true;
                    break;
                }
            }
            if (!skipZero) {
                return false;
            }
        }
        return true;
    }
}

