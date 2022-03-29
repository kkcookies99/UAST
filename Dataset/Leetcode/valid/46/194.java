class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        //添加第一个元素
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(nums[0]);
        res.add(l);
        //后面的每一个元素和res中元素匹配
        for(int a = 1, len2 = nums.length;a < len2;a++){
            for(int i = 0,len = res.size();i < len;i++){
                List<Integer> list = res.get(0);
                int k = 0, len3 = list.size();
                while(k <= len3){
                    List<Integer> tar = new ArrayList<>(list);
                    tar.add(k, nums[a]); //在每个位置插入该元素算一种情况
                    res.add(tar);
                    k++;
                }
                res.remove(0);
            }
        } 
        return res;
    }
}

