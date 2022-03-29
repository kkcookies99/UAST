 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        //如果是奇数个数字，返回第len/2位，如果是偶数个数，还需要第len/2-1位（初始位是0）
        int l=-1,r=-1;//记录中间的两个数字
        int n1=nums1.length,n2=nums2.length;
        int i=0,j=0,len=n1+n2;//指向两个数组的指针
        for(int k=0;k<=len/2;k++){//k表示遍历的数字
            l=r;//记录上一个值
            if(i<n1&&(j>=n2||nums1[i]<=nums2[j])) r=nums1[i++];//当另一个到头了或者比i大的时候，遍历i
            else r=nums2[j++];
        }
        //判断总数的奇偶
        if((len&1)==0) return (l+r)/2.0;//转成double
        else return r;
    }
}

