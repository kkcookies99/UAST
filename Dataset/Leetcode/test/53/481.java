 class Solution {
    public int XXX(int[] nums) {
        int n=nums.length,max=0;
        //ans[]存储所有大于零的子序和
        int[] ans=new int[n];
        ans[0]=nums[0];
        max=nums[0];
        if(n==1){
            return max;
        }
        for(int i=1;i<n;i++){
            //小于零直接舍弃，取零从当前开始
            ans[i-1]= ans[i-1]<=0 ? 0 : ans[i-1];
            ans[i]=ans[i-1]+nums[i];
            max= max>=ans[i] ? max : ans[i];
        }
        return max;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


