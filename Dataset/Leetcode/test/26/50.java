 class Solution {
    public int XXX(int[] nums) {
        //返回的结果
        int res=nums.length;
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                res--;
                j++;
            }else{
                nums[i+1]=nums[j];
                i++;j++;
            }
        }
        return res;
    }
}```

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

