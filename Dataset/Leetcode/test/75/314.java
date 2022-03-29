class Solution {
    public void XXX(int[] nums) {
        int p0=0;
        int p2=nums.length-1;
        for(int i=0;i<=p2;i++){
            //先将该位置变成不是2的数
            while(i<p2 && nums[i]==2){
                swap(nums,i,p2);
                p2--;
            }
            //该处可能是0或1；如果是0，和p0交换,如果是1，不动
            if(nums[i]==0){
                swap(nums,p0,i);
                p0++;
            }
        }
    }
    private void swap(int[] a,int m,int n){
        int temp=a[m];
        a[m]=a[n];
        a[n]=temp;
    }
}

