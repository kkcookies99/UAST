class Solution {
    public List<List<Integer>> XXX(int[] nums) {

        List<List<Integer>> res =new ArrayList<>();
        // List<Integer> path = new ArrayList<>();
        int index=0;
        process(index,nums,res);
        return res;

    }
    //递归定义为
    //对当前index位置做出选择
    void process(int index, int [] nums, List<List<Integer>> res){
        //base
        if(index==nums.length){
           List<Integer> temp  =new ArrayList<>();
           for(int num:nums){
               temp.add(num);
           }
           res.add(temp);
        }

        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            process(index+1,nums,res);
            swap(nums,index,i);
        }
    }
    void swap( int [] nums,int index1 ,int index2){
        int temp =nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}

