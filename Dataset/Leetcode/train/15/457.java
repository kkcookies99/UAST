 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j!=i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int left=j+1,right=nums.length-1,target=0-nums[i]-nums[j];
                while(left<=right){
                    int mid=(left+right)>>1;
                    if(nums[mid]==target){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);list.add(nums[j]);list.add(nums[mid]);
                        ans.add(list);
                        break;
                    } else if(nums[mid]<target){
                        left=mid+1;
                    } else{
                        right=mid-1;
                    }
                }
            }
        }
        return ans;
    }
}

