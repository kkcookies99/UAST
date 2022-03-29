 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int len1=nums1.size(),len2=nums2.size(),need=len1+len2,picked,i=0,j=0,cnt=0;
        bool flag=need%2;
        need=need>>1;
        double tmp1=0,tmp2=0,res;
        while(cnt<=need){
            if(i<len1&&(j==len2||nums1[i]<nums2[j]))picked=nums1[i++];
            else picked=nums2[j++];
            if(cnt==need-1&&!flag)tmp2=picked;
            if(cnt==need)tmp1=picked;
            cnt++;
        }
        res=flag?tmp1:(tmp1+tmp2)/2;
        return res;
    }
};

