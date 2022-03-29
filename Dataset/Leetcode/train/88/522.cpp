 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int l1=m-1,l2=n-1,l3=nums1.size()-1;
        while(l1>=0 && l2>=0){
            nums1[l3--]=nums1[l1]<nums2[l2]?nums2[l2--]:nums1[l1--];
        }
        while(l2>=0){
            nums1[l3--]=nums2[l2--];
        }
    }
};

