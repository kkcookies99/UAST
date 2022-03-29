class Solution {
    public boolean XXX(int[] nums) {
        int len = nums.length;
        int far = 0;
        for(int i = 0; i < len; i++){
            far = Math.max(far, i + nums[i]);
            //先判断是否已经可以到达最后一个位置,到达即返回true
            if(far >= len-1){
                return true;
            }
            if(far == i){
                break;
            }  
        }
        return false;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


