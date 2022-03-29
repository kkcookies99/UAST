 class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> vul= new HashMap<Integer,Integer>();
        int len = nums.length;
        if (len == 1) return nums[0];
        int y=0;
        for (int i = 0; i < len; i++){
            if(vul.containsKey(nums[i])) {
                vul.remove(nums[i]);
            }else {
                vul.put(nums[i],1);
            }
        }
        for(int key:vul.keySet()){
            y= key;
        }return y;
    }
}

