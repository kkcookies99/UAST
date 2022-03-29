 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
           //中位数偶数取(n/2-1和n/2位) 01234 奇数取n/2位
           int len1=nums1.size();
           int len2=nums2.size();
           int flag=(len1+len2)/2;
           int index=0;
           int p1=0;
           int p2=0;
            vector<int> tempArr(flag+1,0);
            //归并排序合并数组，到index超过中位数的位置的时候就停止
            while(p1<len1&&p2<len2&&index<=flag)
            {
                tempArr[index++]=nums1[p1]<nums2[p2]?nums1[p1++]:nums2[p2++];
            }
            while(p1<len1&&index<=flag)
                tempArr[index++]=nums1[p1++];
            while(p2<len2&&index<=flag)
                tempArr[index++]=nums2[p2++];
            
            if((len1+len2)%2==0)
                return (tempArr[flag-1]+tempArr[flag])/2.0;
            else
                return tempArr[flag];

    }
};

