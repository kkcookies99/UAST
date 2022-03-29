 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1])continue;//去重
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                if(j>i+1&&nums[j]==nums[j-1]){//去重
                    j++;
                    continue;
                }
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> list= new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    j++;
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return result;
    }
}

