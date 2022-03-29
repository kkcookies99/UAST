class Solution {
    public boolean XXX(int[] nums) {
        int first = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(i + nums[i] >= first){
                first = i;
            }
        }
        return first == 0;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


