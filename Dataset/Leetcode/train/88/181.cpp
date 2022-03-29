 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
            int ne[m+n],c=0;
            int i=0,j=0;
            while(i<m && j<n){
                if(nums1[i]<=nums2[j]) ne[c++]=nums1[i++];
                else ne[c++]=nums2[j++];
            }
            while(i<m)  ne[c++]=nums1[i++];
            while(j<n)  ne[c++]=nums2[j++];
            for(int i=0;i<c;i++) nums1[i]=ne[i];
    }
};

