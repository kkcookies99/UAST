class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        List<Integer> track = new ArrayList<>();
        backTrack(nums, track, result, 0);
        return result;
    }
    public void backTrack(int[] nums, List<Integer> track, List<List<Integer>> result, int start) {
        result.add(new ArrayList<>(track));
        if (track.size() == nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            track.add(nums[i]);
            backTrack(nums, track, result, start + 1);
            start++;
            track.remove(track.size() - 1);
        }
    }
}

