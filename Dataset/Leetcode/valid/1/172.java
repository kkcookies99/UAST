 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                result[1] = i ;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
        
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


