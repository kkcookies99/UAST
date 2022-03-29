 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();//用于存放结果
        if(nums==null||nums.length==0)//特殊情况
            return list;
        perHelp(nums,0,list);
        return list;
    }
    public void perHelp(int[] nums,int x,List<List<Integer>> list){//递归获得各排列
        if(x==nums.length-1){//当x到达数组最后一个下标时，记录当前nums的结果并返回
            List<Integer> l=new ArrayList<>();
            for(int k=0;k<nums.length;k++)
                l.add(nums[k]);
            list.add(l);
            return;
        }
        for(int i=x;i<nums.length;i++){//固定x位置，从x开始向后
            int t=nums[i];//通过交换位置来获取每次的结果
            nums[i]=nums[x];
            nums[x]=t;

            perHelp(nums,x+1,list);

            t=nums[i];//用完后交换回去
            nums[i]=nums[x];
            nums[x]=t;
        }
    }
}

