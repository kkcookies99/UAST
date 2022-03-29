 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        if(nums==null||nums.length<3)
            return new ArrayList<>();
        int min=0,left=0,right=nums.length-1;
        Arrays.sort(nums);
        List<List<Integer>> re=new ArrayList<>();
        while(min<nums.length-2)
        {
            if(nums[min]>0)
                break;
            if(nums[min]==0)
            {
                if(nums[min+1]==0&&nums[min+2]==0)
                {
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(0);
                    tmp.add(0);
                    tmp.add(0);
                    re.add(tmp);
                }
                break;
            }
            if((min-1)>=0&&nums[min]==nums[min-1])
            {
                while(min<nums.length-2&&nums[min]==nums[min+1])
                    min++;
                break;
            }
            left=min+1;
            right=nums.length-1;
            while(left<right)
            {
                if(nums[min]+nums[left]+nums[right]==0)
                {
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(nums[min]);
                    tmp.add(nums[left]);
                    tmp.add(nums[right]);
                    re.add(tmp);
                    while(left<right&&nums[left]==nums[left+1])
                        left++;
                    left++;
                    while(left<right&&nums[right]==nums[right-1])
                        right--;
                    right--;
                }
                else if(nums[min]+nums[left]+nums[right]>0)
                    right--;
                else
                    left++;
            }
            min++;
        }
        return re;
    }
}

