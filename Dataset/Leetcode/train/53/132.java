class Solution {
    public int XXX(int[] nums) {
       // //暴力法（超时）O(n^3)
       //  int max=Integer.MIN_VALUE;
       //  for(int i=0;i<nums.length;i++){
       //      for(int j=i;j<nums.length;j++){
       //          int sum=0;
       //          for(int k=i;k<=j;k++){
       //              sum+=nums[k];
       //              if(sum>max) max=sum; 
       //          }
       //      }
       //  }
        // //暴力法改进 O(n^2)
        // int max=Integer.MIN_VALUE;
        // int sum;
        // for(int i=0;i<nums.length;i++){
        //     sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum>max) max=sum; 
        //     }
        // }
        
        // //扫描法 全是负数时，输出最大负数
        // //否则和若为负则清零
        // int sum=0,max=0,flag=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0) flag=1;//有正数
        //     if(sum<0) sum=0;
        //     sum+=nums[i];
        //     max=sum>max? sum:max;
        // }
        // if(flag==0){//全负数
        //     int maxnum=Integer.MIN_VALUE;
        //     for(int i=0;i<nums.length;i++){
        //         maxnum=maxnum<nums[i]? nums[i]:maxnum;
        //     }
        //     return maxnum;
        // }
        // return max;
        
        //动态规划法
        int sum=nums[0];
        int cur_sum=nums[0];//当前的最大和
        int max_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(cur_sum>0) cur_sum+=nums[i]; //如果当前最大和是正数，则继续加
            else cur_sum=nums[i];           //如果当前最大和是负数，则丢弃之前结果（由于丢弃后给的是当前之后的值，不论正负，所以可以使得全为负数时也可以每次保留并比较得到最大的哪个负数）
            if(cur_sum>max_sum) max_sum=cur_sum;
        }
        return max_sum;
        
    }
}

