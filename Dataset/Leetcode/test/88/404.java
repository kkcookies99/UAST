 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int place = m+n-1;//nums1中放置下一个数值的位置
        int p=m-1,q=n-1;//p为nums1下一个待比较的位置，q为nums2下一个待比较的位置
        while(q>=0 && p>=0){
            if(nums1[p]>nums2[q])
                nums1[place--]=nums1[p--];//放置，更新place和p
            else
                nums1[place--]=nums2[q--];//放置，更新place和q
        }
        //如果p<0,说明nums2中存在元素比nums1中最小元素小，此时nums1所有元素已比较完
        //将nums2复制过去即可
        if(p<0){
            for(int i=0;i<place+1;i++)
                nums1[i]=nums2[i];
        }
    }
}

