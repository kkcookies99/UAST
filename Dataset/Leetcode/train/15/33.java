 class Solution {
    public List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> track = new LinkedList<>();
        three(nums,0,track);
        return res;
    }

    public void three(int[] nums, int index, List<Integer> track) {
        if (track.size() == 3) {
            if (track.stream().collect(Collectors.summingInt(Integer::intValue)) == 0) {
                res.add(new LinkedList<>(track));
            } else {
                return;
            }
        }
        for (int i = index; i < nums.length; i++) {
            track.add(nums[i]);
            three(nums,i+1,track);
            track.remove(track.size()-1);
        }
    }
}

