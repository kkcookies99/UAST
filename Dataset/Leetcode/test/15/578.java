 class Solution {
    private List<List<Integer>> result;
    private int[] nums;
    private HashSet<String> set;

    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        result=new LinkedList<>();
        set=new HashSet<>();
        this.nums=nums;
        backtrack(new LinkedList<Integer>(),0,0);
        return result;
    }
    private void backtrack(LinkedList<Integer> track,int sum,int start){
        //简单情况
        if(nums.length<3){
            return;
        }

        //base case
        if(track.size()==3 && sum==0){
            String s="";
            for(int num:track.toArray(new Integer[3])){
                s=s+num+",";
            }
            if(!set.contains(s)){
                set.add(new String(s));
                result.add(new LinkedList<Integer>(track));
            }
            
            return;
        }

        for(int i=start;i<nums.length;i++){
            track.add(nums[i]);
            sum+=nums[i];
            backtrack(track,sum,i+1);
            track.removeLast();
            sum-=nums[i];
        }
        return;
    }
}

