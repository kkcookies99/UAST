 class Solution {
    public int XXX(int[] nums, int val) {
        int count=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                count++;
                nums[count]=nums[i];
            }
        }
        return count+1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

