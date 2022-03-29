 class Solution {
    public int XXX(int[] nums) {
        if(nums.length==1) return nums[0];
        int i = 0;
        int max = nums[0];
        while (i < nums.length){
            int sum = 0;
            for(int j = i;j<nums.length;j++){
                sum += nums[j];
                if(max < sum){
                    max = sum;
                }
            }
            i++;
        }
        return max;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


