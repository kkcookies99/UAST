public List<List<Integer>> XXX(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    ArrayList list = new ArrayList<Integer>();
    XXX(res,list,nums,0);
    return res;
}
public void XXX(List<List<Integer>> res,ArrayList<Integer> list,int []nums,int index) {
    if(index == nums.length){
        ArrayList perList = new ArrayList<>();
        perList.addAll(list);
        res.add(perList);
        return;
    }else{
        for(int i = 0;i < nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                XXX(res,list,nums,index+1);
                list.remove(list.size() - 1);
            }
        }           
    }
}

