 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int size = nums.length;
        List<List<Integer>> result = new LinkedList<>(); 
        Arrays.sort(nums);
        if(size==0){
            return result;
        }
        if(nums[nums.length-1]<0){
            return result;
        }
        if(nums[0]>0){
            return result;
        }
        for(int i = 0;i<=size-3;i++){
            if(nums[i]>0){
                return result;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int right = size -1;
            int left = i+1;

            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    List<Integer> ans = new LinkedList();
                    ans.add(nums[i]);
                    ans.add(nums[left]);
                    ans.add(nums[right]);
                    result.add(ans);
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1])                     {
                        right--;   
                     }
                     left++;
                     right--;
                }
                else if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                }
                else if (nums[i]+nums[left]+nums[right]<0){
                    left++;
                }
            }


        }
        return result;
    }
}

