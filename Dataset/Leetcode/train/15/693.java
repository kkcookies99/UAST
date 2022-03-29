 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            if(nums[i]>0){break;}
            if(i > 0 && nums[i] == nums[i - 1]) {continue;}
            while(left<right){
            if(nums[i]+nums[left]+nums[right] > 0){
                right--;
                while(left<right&&nums[right]==nums[right+1]){
                    right--;
                }                
            }
            if(nums[i]+nums[left]+nums[right] < 0){
                left++;
                 while(left<right&&nums[left]==nums[left-1]){
                            left++;
                    }
            }
            if(left<right&&nums[i]+nums[left]+nums[right] == 0){
                List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);
                    left++;
                     while(left<right&&nums[left]==nums[left-1]){
                            left++;
                    }
                    right--;
                     while(left<right&&nums[right]==nums[right+1]){
                            right--;
                    }
            }
            }
        }
        return ans;
    }
}

