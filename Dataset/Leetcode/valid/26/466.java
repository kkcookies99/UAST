 class Solution {
    public int XXX(int[] nums) {
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            if(!num.contains(nums[i]))
                num.add(nums[i]);
        }


        nums = num.stream().mapToInt(Integer::valueOf).toArray();
        return num.size();
    }
}

