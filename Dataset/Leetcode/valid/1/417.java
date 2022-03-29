 class Solution {
    public int[] XXX(int[] nums, int target) {
int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = target - a;
            if (map.containsKey(b)){
                result[0] = i;
                result[1] = map.get(b);
                return result;
            }
            map.put(a,i);
        }
        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


