class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> list1,list2;
        if(nums==null||nums.length==0){
            return null;
        }
        if(nums.length<2){
            list1=new LinkedList<Integer>();
            list1.add(nums[0]);
            result.add(list1);
            return result;
        }
        list1=new LinkedList<Integer>();
        list2=new LinkedList<Integer>();
        list1.add(nums[0]);
        list1.add(nums[1]);
        result.add(list1);
        list2.add(nums[1]);
        list2.add(nums[0]);
        result.add(list2);
        
        for(int i=2;i<nums.length;i++){
            result=XXX(result,nums[i]);
        }      
        return result;
    }
    
    public List<List<Integer>> XXX(List<List<Integer>> arr,int insertVal) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();  
        for(List<Integer> list:arr){
            for(int i=0;i<list.size()+1;i++){
                List<Integer>  templist=new LinkedList<Integer>(list);
                templist.add(i,insertVal);    
                result.add(templist);          
            }
        }
        return result;    
    }   
}

