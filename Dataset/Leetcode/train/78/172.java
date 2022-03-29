class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        if(nums==null||nums.length<=0){
            return res;
        }
        for(int n:nums){
            int k=res.size();
            List<Integer> list=new ArrayList<>();
            list.add(n);
            res.add(list);
            for(int i=0;i<k;i++){
                List<Integer> list2=new ArrayList<>();
                list2.addAll(res.get(i));
                list2.add(n);
                res.add(list2);
            }
        }
        res.add(new ArrayList<>());
        return res;
    }

}

