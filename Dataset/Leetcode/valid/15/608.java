 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        if(n<3)return res;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i-1]==nums[i])continue;
            if(nums[i]>0) continue;
            int L = i+1;
            int R = n-1;
            while(L<R){
                if(nums[i]+nums[L]+nums[R]==0){
                    List some = new ArrayList<Integer>();
                    some.add(nums[i]);
                    some.add(nums[L]);
                    some.add(nums[R]);
                    res.add(some);
                    do{
                        L++;
                    }while(L<R && nums[L]==nums[L-1]);
                    do{
                        R--;
                    }while(R>L && nums[R]==nums[R+1]);
                }
                else if(nums[i]+nums[L]+nums[R] < 0){
                    do{
                        L++;
                    }while(L<R && nums[L]==nums[L-1]);
                }
                else{
                    do{
                        R--;
                    }while(R>L && nums[R]==nums[R+1]);
                }
            }
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


