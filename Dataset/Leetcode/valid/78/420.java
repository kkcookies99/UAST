 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(ls);//先添加空集
        if(nums.length==0)return result;
        //结果集个数  以例子为例： C31+C32+C33+1个空集  C31表示组合，3个数中取1个数
        for(int i=1;i<=nums.length;i++){
            dealCmn(nums,i,ls,result,0);
        }
        return result;

    }
    //m表示还需要取的数字个数
    public void dealCmn(int[] nums,int m,List<Integer> ls,List<List<Integer>> result,int start){
        if(m==0){
            result.add(ls);
            return;
        }
        for(int i=start;i<nums.length;i++){
            List<Integer> temp = new ArrayList<>();
            //简单的深复制 保留上一层的列表
            for(int j:ls){
                temp.add(j);
            }
            temp.add(nums[i]);
            dealCmn(nums,m-1,temp,result,i+1);
        }
    }
}

