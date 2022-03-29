 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] a=new int[2];
        int temp;
        for(int i=0;i<nums.length;i++){
            temp=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if((nums[j]+temp)==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
            if(a[0]!=0||a[1]!=0){
                break;
            }
        }
        return a;
    }
}

