 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int count = (nums1.size() + nums2.size())/2;
        int i = 0;
        int j = 0;
        int a;
        int b;

        while(count >= 0) {
            a = b;
            if (nums2.empty() || (j==nums2.size()) || (i != nums1.size() && nums1[i] <= nums2[j])) {
                b = nums1[i];
                i++;
            } else {
                b = nums2[j];
                j++;
            }
            count--;
        }

        // cout << a<< " "<<b << endl;

        if ((nums1.size()+nums2.size() ) % 2 != 0){
            return b;
        }
        
        return (a+b)/2.0;
    }
};

