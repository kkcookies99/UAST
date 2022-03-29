 class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();//利用set集合不存储重复的数
        for(int i:nums){
            if (!set.add(i)){
                set.remove(i);
            }
        }
        return set.toArray(new Integer[set.size()])[0];
    }
}


