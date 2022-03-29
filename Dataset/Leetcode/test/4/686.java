 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        //获取两个数组的长度
        int length1=nums1.length;
        int length2=nums2.length;
        //初始化三个指针
        int now1=0,now2=0,now3=0;
        //新建一个数组用于保存合并后的数组
        int[] all=new int[length1+length2];
        //开始合并两个数组
        while(now1<=length1-1 && now2<=length2-1){
            if(nums1[now1]<nums2[now2]){
                all[now3]=nums1[now1];
                now1++;
                now3++;
            }else{
                all[now3]=nums2[now2];
                now2++;
                now3++;
            }
        }
        if(now1<=length1-1){
            while(now1<=length1-1){
                all[now3]=nums1[now1];
                now1++;
                now3++;
            }
        }
        if(now2<=length2-1){
            while(now2<=length2-1){
                all[now3]=nums2[now2];
                now2++;
                now3++;
            }
        }
        //分情况开始输出
        if(all.length==1){
            return all[0];
        }
        if(all.length%2==0){
            return (Double.valueOf(all[(all.length/2)-1])+Double.valueOf(all[all.length/2]))/Double.valueOf(2);
        }else{
            return all[all.length/2];
        }
    }
}

