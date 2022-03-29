 class Solution {
    public int XXX(int[] nums, int target) {
        if(nums==null)
        return -1;
        int n=nums.length;
        int sear=0;
        boolean t=true;
        if(nums[n-1]<target)
        {
        sear=n;
        t=false;
        }
        if(nums[0]>target)
        {
        sear=0;
        t=false;
        }
        while(t)
        {        
            for(int i=0;i<n;i++)
             {
                 if(nums[i]==target)
                 {
                 sear=i;
                 t=false;
                 break;
                 }
                 if(nums[i]>target)
                 {
                 sear=i;
                 t=false;
                 break;
                 }
            }
         } 
    return sear;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

