 class Solution {
    public int[] XXX(int[] nums, int target) {
        if (nums.length < 1) {
            throw new IllegalArgumentException(); 
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(target - nums[i], i);
            } else {
                return new int[]{i, map.get(nums[i])};
            }
        }
        throw new IllegalArgumentException();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


