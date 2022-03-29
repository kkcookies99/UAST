 public List<List<Integer>> XXX(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<Integer>();
    XXX(res,list,nums,0);
    return res;
}
public void XXX(List<List<Integer>> res,List<Integer> preList,int[] nums,int index) {
    List<Integer> list = new ArrayList<Integer>();
    if(index == nums.length){
        res.add(preList);
        return;
    }else{
        XXX(res,preList,nums,index+1);
        list.addAll(preList);
        list.add(nums[index]);
        XXX(res,list,nums,index+1);
    }
}

