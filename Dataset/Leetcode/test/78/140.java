class Solution {
    
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> list = new LinkedList<>();
        set.add(list);
        if(nums == null || nums.length == 0) 
            return new ArrayList(set);
        find(nums,0,list);
        return new ArrayList(set);
    }
    
    public void find(int[] arr,int start,List<Integer> list){
        if(start == arr.length) return;
        
        for(int i = start; i < arr.length; i++){
            List<Integer> temp = new LinkedList(list);
            temp.add(arr[i]);
            set.add(temp);
            find(arr,i+1,temp);
        }
    }
}
