 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i += 2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


