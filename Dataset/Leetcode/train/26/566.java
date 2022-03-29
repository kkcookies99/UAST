 class Solution {
    public int XXX(int[] nums) {
        //假设有n个不重复数，则应该覆写nums前n个数
        int len = nums.length;
        int res = 1;//不重复数的个数，第一个数直接算入
        int index = 0;//指示当前覆写到的位置
        for(int i = 0;i<len-1;i++){
            if(nums[i]<nums[i+1]){
                res++;
                //覆写，index后移
                nums[++index] = nums[i+1];
            }
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


