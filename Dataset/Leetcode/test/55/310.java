class Solution {
    public boolean XXX(int[] nums) {
        int last = nums.length-1;
        int plus =0;
        for(int i = last-1; i>=0; i--){
            if(nums[i] > plus){
                plus = 0;
            }else{
                plus++;
            }
        }
        if(plus == 0){
            return true;
        }
        return false;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


