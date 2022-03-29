 class Solution {
    public int XXX(int[] nums, int val) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[i-count] = nums[i];
            }else{
                count++;
            }
        }
        return nums.length-count;

    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


