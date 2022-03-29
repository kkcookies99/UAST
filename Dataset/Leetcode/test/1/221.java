 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] result = new int[2];
       //整个map，用于下面去匹配
        Map<Integer,Integer> temp = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
           //匹配上了就处理返回结果，没匹配上就加入到map继续往下匹配
            if(temp.containsKey(value)) {
                result[0] = temp.get(value);
                result[1] = i;
                return result;
            }else {
                temp.put(nums[i],i);
            }
        }
        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


