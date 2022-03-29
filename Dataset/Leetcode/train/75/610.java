 class Solution {
    public void XXX(int[] nums) {
        for(int i=0,l=0,r=nums.length-1;i<r+1;i++)
            if(nums[i]==0)  
                swap(nums,l++,i);
            else if(nums[i]==2)  
                swap(nums,r--,i--);
    }
    private static void swap(int[] nums,int l,int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


