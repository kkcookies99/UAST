 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
         
         List<List<Integer>>ans=new ArrayList<>();
         if(nums.length<3) return ans;
        Set<List<Integer>>set=new HashSet<>();
        Arrays.sort(nums);
      
        for(int i=0;i<nums.length-1;i++){
            int left=i;
            int mid=i+1;
            int right=nums.length-1;
           while(mid<right)
           {
            if(nums[mid]+nums[right]+nums[left]>0){
                right--;
            }
            else if(nums[mid]+nums[right]+nums[left]<0){
                mid++;
            } else{
               List<Integer>list=new ArrayList<>();
               list.add(nums[left]);
               list.add(nums[mid]);
               list.add(nums[right]);
               set.add(list);
               right--;
               mid++;//找到一组答案后同时收缩,继续搜索
               
            }
           }
        }
        for(List<Integer>list:set){
            ans.add(list);
        }
        return ans;
    }
}

