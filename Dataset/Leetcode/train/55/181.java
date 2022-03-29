class Solution {
    public boolean XXX(int[] nums) {
        int p=nums[0],far=-1,n= nums.length;
        if(n==1){
            return true;
        }
        for(int i=1;i< n&&i<=p;i++){
            far=Math.max(p,i+nums[i]);
            p=far;
            if(far>=n-1){
                return true;
            }
        }
        return false;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


