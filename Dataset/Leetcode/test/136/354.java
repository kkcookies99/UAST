 class Solution {
    public int singleNumber(int[] nums) {
    ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (b.size() == 0) {
                b.add(nums[i]);
            } else {
                for (int j = 0; j < b.size(); j++) {
                    if (nums[i] == b.get(j)) {
                        b.remove(b.get(j));
                        break;
                    }
                    if (j == b.size()-1) {
                        b.add(nums[i]);
                        break;
                    }
                }
            }
        }
        return b.get(0);
    }
}

