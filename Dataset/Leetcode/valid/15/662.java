 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] > 0) {
               return res; 
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left=i+1;
            int right=n-1;
            int cur=nums[i];
            a:while(left<right){
                int tmp=cur+nums[left]+nums[right];
                if(tmp==0){
                    List<Integer> lists =new ArrayList<Integer>();
                    lists.add(cur);
                    lists.add(nums[left]);
                    lists.add(nums[right]);
                    res.add(lists);
                    while( (left<right)&& (nums[left+1]==nums[left])){
                        if(left==n-1){
                            break a;
                        }
                        left++;     
                    }
                    while(left<right && nums[right]==nums[right-1] ){
                        right--;
                    }
                    left++;
                    right--; 
                }
                else if(tmp<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;
    }
}

