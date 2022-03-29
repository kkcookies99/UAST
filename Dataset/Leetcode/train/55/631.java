 class Solution {
    public boolean XXX(int[] nums) {
        int res=0;int i=1;int j=0;int num=0;int a=0;int k=0;
        int n=nums.length;
        if(n==0)return false;
        if(n==1)return true;
        boolean flag=false;
        while(true)
        {
            if((res+nums[res])>=n-1||res>=n-1)return true;
            for(i=1;i<=nums[res];i++)
            {
                num=nums[i+res]+i+res;
                if(num>a)
                {
                    a=num;
                    k=i+res;
                    flag=true;
                }
            }
  //          System.out.println(a);
            if(flag==false)return false;
            res=k;i=1;flag=false;a=-1;
        }        
    }
}

