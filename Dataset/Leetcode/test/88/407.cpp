 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int len=nums1.size()-1;
        m--,n--;
        while(m>=0&&n>=0){
            if(nums1[m]<=nums2[n]){
                nums1[len]=nums2[n];
                n--;
                len--;
            }else{
                nums1[len]=nums1[m];
                m--;
                len--;
            }    
        }
        while(n>=0){
            nums1[len--]=nums2[n--];
        }
    }
};

