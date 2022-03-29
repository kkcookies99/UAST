 class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            // 无法成功添加就删掉
            if(!set.add(num)) set.remove(num);
        }
        
        // 返回哈希表中剩下的元素
        for(int i : set) {
            result = i;
        }
        return result;
    }
}

