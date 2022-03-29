 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        long count=(long)Math.pow(2,nums.length);
        List<List<Integer>>  result=new ArrayList<List<Integer>>(); 
        long temp=0;
        while(temp<count){
            List<Integer> tempList=new ArrayList<Integer>();
            long t=temp;
            int ct=0;
            while(t!=0){
                if((t&0x01)==1){
                    tempList.add(nums[ct]);
                }
                ct++;
                t=t>>1;   
            }
            result.add(tempList); 
            temp++; 
        }
        return result;   
    }
}

