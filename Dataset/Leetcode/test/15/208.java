 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i==0||nums[i]!=nums[i-1]){
                int k=0-nums[i];
                int l=i+1;
                int r=nums.length-1;
                while(l<r){
                    if(l>i+1 && nums[l]==nums[l-1]){
                        l++;
                    }else if(r<nums.length-1 && nums[r]==nums[r+1]){
                        r--;
                    }else{
                        if(nums[l]+nums[r]==k){
                            List<Integer> list = new ArrayList<>(3);
                            list.add(nums[i]);
                            list.add(nums[l]);
                            list.add(nums[r]);
                            result.add(list);
                            l++;
                            r--;
                        }else if (nums[l]+nums[r]>k){
                            r--;
                        }else if(nums[l]+nums[r]<k){
                            l++;
                        }
                    }
                }
            }
        }
        return result;
    }
}

