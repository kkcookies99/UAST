 class Solution {
    //三树之和变为两数之和的问题，{注意剪枝，用来避免重复的答案}
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        //将nums数组进行排序，默认从小到大==》为了方便去重复
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            //如果本次循环的起始值与上次循环的起始值相同，这次循环是可以跳出的
            //因为上次循环的结果与本次循环的结果相比，多了一种情况，就是可以出现【1,1,-2】这样的情况，其他情况将完全相同
           if(i>0 && nums[i]==nums[i-1]) continue; 
           //int target=0-nums[i]
           //将target变为我们要寻找的目标值，将三数之和变为在剩余的数据中找到两数之和等于target的数字
           int target=-nums[i];
            //双指针来找是否存在两数之和
          int j=i+1;
          int k=n-1;
          while(j<k){
              //用于去重复的相邻数据--》因为已经排序，所以是相邻的数据可能相等
              if(j>i+1 && nums[j-1]==nums[j]){
                  j++;
                  continue;
              }
              if(nums[j]+nums[k]<target){
                  j++;
              }
              else if(nums[j]+nums[k]>target){
                    k--;
              }else{
                  //Arrays.asList ()将数组转为list
                   list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                   j++;
                   k--;
              }
          }
        }
        return list;
    }
}

