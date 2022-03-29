 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        List <List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0)
                break;
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]>-nums[i])
                    k--;
                else if(nums[j]+nums[k]<-nums[i])
                    j++;
                else{
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k])));
                    while(j < k && nums[j] == nums[++j]);
                    while(j < k && nums[k] == nums[--k]);
                }
            }
            
        }
        return res;
    }
}

