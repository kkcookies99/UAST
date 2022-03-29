 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        //排序数组，之后定义三个指针，i，l,r,从i开始遍历，
        //当nums[l]+nums[r]=-nums[i]就添加进List；O（n^2+n）;
        //不过不能重复的三元组
        Arrays.sort(nums);
        int length=nums.length;
        List<List<Integer>>list=new ArrayList<>();
        if(length==0)
            return list;
        for(int i=0;i<nums.length-2;i++)
        {
            //与前一个值一样，不处理了
            if((i!=0)&&(nums[i]==nums[i-1]))
                continue;
            int l=i+1;
            int r=length-1;
            while(l<r)
            {
                if(nums[l]+nums[r]+nums[i]==0)
                {
                    list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    //去掉重复
                    while(l<r&&nums[l]==nums[l+1])l++;
                    while(l<r&&nums[r]==nums[r-1])r--;
                    l++;
                    r--;
                }
                //-5 1 6
                else if(nums[l]+nums[r]+nums[i]>0)
                {
                    r--;
                }
                //-5 1 2
                else
                    l++;
            }
        }
        return list;
    }
}

