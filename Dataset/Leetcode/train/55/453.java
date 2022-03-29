 class Solution {
    public boolean XXX(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<=max;i++){
            if(max>=n-1) return true;
            if(nums[i]+i>max) max=nums[i]+i;
        }
        return false;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


