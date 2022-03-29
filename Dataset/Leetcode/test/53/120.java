class Solution {
    public int XXX(int[] nums) {
        return func1(nums,0,nums.length-1);

    }
    public int func1(int[] nums,int L,int R){
        if(L==R)
            return nums[L];
        int Mid=L+((R-L)>>1);
        int L_value=func1(nums,L,Mid);//左边最大值
        int R_value=func1(nums,Mid+1,R);//右边最大值
        int M_value=func2(nums,L,Mid,R);//跨越中线的最大值
        return Math.max(Math.max(L_value,R_value),M_value);
    }
    public int func2(int[] nums,int L,int M,int R){
        int l_max=Integer.MIN_VALUE;
        int r_max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=M;i>=L;i--){
            sum+=nums[i];
            if(sum>l_max)
                l_max=sum;
        }
        sum=0;
        for(int j=M+1;j<=R;j++){
            sum+=nums[j];
            if(sum>r_max)
                r_max=sum;
        }
        return l_max+r_max;
    }
}

