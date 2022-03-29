 class Solution {
public:
    double findkth(int k, vector<int>& nums1, vector<int>& nums2, int s1,int s2){ 
        if(s1==nums1.size())return nums2[s2+k-1];
        if(s2==nums2.size())return nums1[s1+k-1];    
        if(k==1) return nums1[s1]<nums2[s2]?nums1[s1]:nums2[s2];
        int k2=k>>1,k3=min(nums1.size()-s1,nums2.size()-s2);
        k2=min(k2,k3);
        if(nums1[s1+k2-1]<nums2[s2+k2-1])return findkth(k-k2,nums1,nums2,s1+k2,s2);
        else return findkth(k-k2,nums1,nums2,s1,s2+k2);
    }
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int len=nums1.size()+nums2.size();
        int k=len>>1,flag=len%2;
        if(flag)return findkth(k+1,nums1,nums2,0,0);
        else return (findkth(k+1,nums1,nums2,0,0)+findkth(k,nums1,nums2,0,0))/2;   
    }
};

