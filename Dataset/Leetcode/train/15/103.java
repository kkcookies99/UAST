 public List<List<Integer>> XXX(int[] nums) {

     List<List<Integer>> list=new ArrayList<>();
    //先给数组进行排序
    Arrays.sort(nums);
    //定一个数x，用两个指针指向数组中在它后面的元素的开始和结尾，向中间遍历
   for(int k=0;k<nums.length-2;k++)
   {
       if(!list.isEmpty()&&nums[k]==nums[k-1])  //去重条件  重点
       {
           continue;
       }
       int i=k+1,j=nums.length-1;
       int sum=0-nums[k];
       while(i<j)
       {
       if(nums[i]+nums[j]==sum)
       {
           List<Integer> list1=new ArrayList<>();
           list1.add(nums[k]);
           list1.add(nums[i]);
           list1.add(nums[j]);
           list.add(list1);
           i++;
           j--;
           while(nums[i]==nums[i-1]&&i<j)
           {
               i++;
           }
           while(nums[j]==nums[j+1]&&i<j)
           {
               j--;
           }
       }
       else if(nums[i]+nums[j]<sum&&i<j)
       {
           i++;
           continue;
       }  
       else 
       {
           j--;
           continue;
       }              
   }
   }
   
    
    return list;
}

