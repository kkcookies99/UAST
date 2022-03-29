 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int len=nums.length;
        if(len<=2)return new ArrayList<>();//如果本来就少于3个数，就直接输出空数组
        Arrays.sort(nums);//排序
        if(nums[0]>0)return new ArrayList<>();//如果排完序最小的数都比0大，那表示不可能合为0，也是直接输出空数组
        int left=0;//双指针，左边指针
        int right=0;//双指针，右边指针
        List<List<Integer>> res=new ArrayList<>();//将结果存在res里
        for(int i=0;i<len;i++){//外循环，遍历数组中的每一个数
            if(nums[i]>0) break;//如果接下来要遍历的数比0大，说明其后的那个[i,len-1]的子数组也不能合成0，直接跳出循环即可；
            if(i>0&&nums[i]==nums[i-1])continue;//避免重复，如果这个数前面已经比较果了，就直接到下一个不同的数开始扫描
            int target=-nums[i];//目标数，nums[left]+nums[right]==target
            left=i+1;//每次都从i+1开始
            right=len-1;//每次都从数组最后一位开始
            while(left<right){//内层循环的跳出条件，不能是left<=right，因为left必须跟right不同
                List<Integer> list=new ArrayList<>();//将扫描nums[i]时得到的扫描结果存下来
                if(nums[left]+nums[right]==target){//如果三数之和等于0
                    list.add(nums[i]);//分别将这三个数存下来
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);//加入外层数组
                    left++;//左边指针++
                    right--;//右边指针--；
                    while(left<len&&nums[left-1]==nums[left])left++;//避免重复，左边指针走到下一个不重复的数
                    while(right>0&&nums[right]==nums[right+1])right--;//避免重复，右边指针走到下一个不重复的数
                }
                else{
                    if(nums[left]+nums[right]>target)right--;//如果三数之和大于0，表示右边的数还是太大，把右边的数变小点
                    else{//三数之和小于0，表示左边的数过小了，把左边的数变大点
                        left++;
                    }
                }
            }
        }
        return res;
    }
}

