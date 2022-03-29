 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int m = nums1.size();
        int n = nums2.size();
 
        if(m > n) return XXX(nums2, nums1);
        
        int left = 0, right = m;
        double ans = 0;
        
        while(left <= right){
            int i = left + (right - left) / 2;
            int j = (m + n + 1) / 2 - i;
            
            int l1 = i == 0 ? INT_MIN : nums1[i - 1];
            int r1 = i == m ? INT_MAX : nums1[i];
            int l2 = j == 0 ? INT_MIN : nums2[j - 1];
            int r2 = j == n ? INT_MAX : nums2[j];
            
            if(l1 <= r2 && l2 <= r1){
                if((m + n) & 0b01){
                   ans = max(l1, l2);
                } else {
                    ans = static_cast<double>(max(l1, l2) + min(r1, r2)) / 2;
                }
                break;
            } else if(l1 > r2 || l2 < r1){
                right = i - 1;
            } else left = i + 1;
        }
        
        return ans;
    }
};

