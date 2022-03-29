class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        double ans = 0;
        vector<int> nums3;
        nums3.resize(nums1.size() + nums2.size() + 2); //为新数组分配空间，为避免空间不足多分配2
        
        merge(nums1.begin(), nums1.end(), nums2.begin(), nums2.end(), nums3.begin()); // 合并数组
        
        int n = nums3.size() - 2; // n为新数组的长度，由于分配时多分配2此时减去
    
        if (n % 2 == 1) // 长度为奇数
        {
            ans = nums3[(n - 1) / 2]; // 从0开始，参考上面公式
        }
        else
        {
            ans = (nums3[n / 2] + nums3[(n / 2) - 1] ) / 2.0; // 长度为偶数，此时/2.0由于精度问题需要除一个浮点数而不能除整数，否则会造成精度丢失，如：5 / 2 = 2, 5 / 2.0 = 2.5
        }
        

        return ans;


    }
};

