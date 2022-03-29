 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        if(nums.length==0){
            return null;
        }
        List<List<Integer>> result=new LinkedList<List<Integer>>();
        //把第1个元素放进result
        List<Integer> original_factor=new LinkedList<Integer>();
        original_factor.add(nums[0]);
        result.add(original_factor);
        for(int i=1;i<nums.length;i++){
            //从第2个开始，逐渐组合，新加入的数字在上一次循环组成的元素中每个增加一个位置
            List<List<Integer>> new_temp_result=new LinkedList<List<Integer>>();
            for(List<Integer> l:result){
                int new_factor_length=l.size()+1;
                int index=0;  //指新加入的数字的下标
                while(index<new_factor_length){
                    List<Integer> new_factor=new LinkedList<Integer>(l);
                    new_factor.add(index,nums[i]);
                    new_temp_result.add(new_factor);
                    index++;
                }
            }
            result=new_temp_result;
        }

        return result;
    }
}

