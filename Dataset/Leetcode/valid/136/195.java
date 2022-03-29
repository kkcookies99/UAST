 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i=0;i<nums.length;i+=2){

            if(i!=nums.length-1&&nums[i]!=nums[i+1]){

                if((i!=0&&nums[i]!=nums[i-1])||(i==0)){
                    return nums[i];
                }
            }

        }

        return nums[nums.length-1];
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


