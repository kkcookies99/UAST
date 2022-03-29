class Solution {
    public void XXX(int[] nums) {
        int n = nums.length;
        if(n<=1) return;
        int i=0,j=n-1,k=i;
        while(k<=j){
            if(nums[k]==0){
                swap(nums,i,k);
                i++;
                k++;
            }else if(nums[k]==2){//无法确定换过来的是什么数，所以k先保持在原位置
                swap(nums,k,j);
                j--;
            }else{
                k++;
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


