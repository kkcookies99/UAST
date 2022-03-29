class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<ArrayList<Integer>> last=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> empty=new ArrayList<Integer>();
        last.add(empty);
        for(int i=1;i<nums.length+1;i++){
            List<ArrayList<Integer>> curr=new ArrayList<ArrayList<Integer>>();
            
            for(ArrayList<Integer> list:last){
                curr.add(list);
                ArrayList<Integer> add=new ArrayList<Integer>();
                add.addAll(list);
                add.add(nums[i-1]);
                curr.add(add);
                last=curr;
            }
        }
        return (List)last;
    }
}

