 class Solution {
    public void XXX(int[] nums) {
        int min=0,max=nums.length-1,tmp=0;
        for(int i=0;i<=max;i++){
            if(nums[i]==2){
                while(nums[max]==2&&max>i){
                    max--;
                }
                tmp = nums[i];
                nums[i] = nums[max];
                nums[max] = tmp;
                max--;
            }
            if(nums[i]==0){
                while(nums[min]==0&&min<i){
                    min++;
                }
                tmp = nums[i];
                nums[i] = nums[min];
                nums[min] = tmp;
                min++;
            }
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


