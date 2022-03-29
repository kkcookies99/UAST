 class Solution {
    public boolean XXX(int[] nums) {
        int distance = 0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>distance) distance = 0;
            else distance++;
        }
        return distance>0?false:true;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


