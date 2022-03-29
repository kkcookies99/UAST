 class Solution {
    public boolean XXX(int[] nums) {
        int jump = nums[0];
        for(int i=1;i<nums.length;i++){
            jump--;
            if(jump==-1){
                return false;
            }
            jump = Math.max(jump,nums[i]);
        }

        return true;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


