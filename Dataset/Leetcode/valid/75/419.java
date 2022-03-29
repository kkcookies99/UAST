 class Solution {
    public void XXX(int[] nums) {
        int len=nums.length;
        int[] res=new int[len];
        int[] tmp=new int[3];
        for(int num:nums){
            tmp[num]++;
        }
        int k1=tmp[0];
        int k2=tmp[1];
        int k3=tmp[2];
        for(int i=0;i<k1;i++){
            nums[i]=0;
        }
        for(int i=k1;i<k2+k1;i++){
            nums[i]=1;
        }
        for(int i=k2+k1;i<k3+k1+k2;i++){
            nums[i]=2;
        }
    }
}

