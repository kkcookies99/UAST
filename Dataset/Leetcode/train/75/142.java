public void XXX(int[] nums) {
    int i=0,j=nums.length-1,a=0;
    while(a<nums.length){
        if(nums[a]==0&&a>=i){
            swap(nums,a,i);
            i++;
            a++;
        }else if(nums[a]==2&&a<=j){
            swap(nums,a,j);
            j--;
        }else a++;     
    }
}
private void swap(int[] li,int i,int j){
    int a=li[i];
    li[i]=li[j];
    li[j]=a;
}

