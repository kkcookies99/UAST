 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        double ans=0;
        int [] nums3=new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,nums3,0,nums1.length);
        System.arraycopy(nums2,0,nums3,nums1.length,nums2.length);
        //合并
        int n=nums3.length;
        int index=0,current=0;
        for (int i=0;i<n;i++)
        {
            index=i-1;
            current=nums3[i];
            while (index>=0 && nums3[index]>current){
                nums3[index+1]=nums3[index];
                index--;
            }
            nums3[index+1]=current;
        }
        //排序
      for (int i=0;i<n;i++)
      {
          System.out.println(nums3[i]);
      }
        int a=n/2;

        int b=n%2;

        if(b==0){
            if((nums3[a]+nums3[a-1])%2!=0){
                ans=(nums3[a]+nums3[a-1])/2+0.5;


            }
            else {
                ans=(nums3[a]+nums3[a-1])/2;
            }

        }else {
            ans=nums3[a];
        }
        return ans;
    }
}

