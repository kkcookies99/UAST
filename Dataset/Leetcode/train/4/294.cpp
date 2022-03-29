 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {

        if(nums1.size() > nums2.size()){
            return XXX(nums2, nums1);
        }

        int m = nums1.size();
        int n = nums2.size();

        double ans = 0;
        for(int i = 0; i <= m; i++){
            int j = (m + n + 1) / 2 - i;

            double l1 = (i - 1 >= 0) ? nums1[i - 1] : INT_MIN;
            double r1 = (i < m) ? nums1[i] : INT_MAX;
            double l2 = (j - 1 >= 0) ? nums2[j - 1] : INT_MIN;
            double r2 = (j < n) ? nums2[j] : INT_MAX; 

            if( l1 <= r2 && l2 <= r1){
                if((m + n) & 0b01){
                    ans = max(l1, l2);
                }
                else{
                    ans = (max(l1, l2) + min(r1, r2)) / 2;
                }
            }
        }

        return ans;
    }
};

