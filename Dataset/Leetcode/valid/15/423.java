 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        if(nums.length<3) return list;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) break;
            if(i>0&&(nums[i]==nums[i-1])) continue;
            int m=i+1,n=nums.length-1;
            while(m<n){
                if(nums[i]+nums[m]+nums[n]==0){
                    list.add(Arrays.asList(nums[i],nums[m],nums[n]));
                    while(m<n&&nums[m+1]==nums[m]) {m++;}
                    while(m<n&&nums[n-1]==nums[n]) {n--;}
                    m++;n--;
                }else if(nums[i]+nums[m]+nums[n]>0){
                    n--;
                }else{
                    m++;
                }
            }
        }
        return list;
    }
}

