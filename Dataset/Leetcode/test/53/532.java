 class Solution {
    public int XXX(int[] nums) {
       if (nums.length == 1) return nums[0];
        int max = nums[0];
        int count = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]+count > nums[i]){
                count += nums[i];
                if (count > max){
                    max = count;
                }
            }else{
                count = nums[i];
            }
            if (nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


