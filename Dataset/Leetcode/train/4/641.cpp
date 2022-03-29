 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        double pro = 0;

        for(int i = 0;i<nums2.size();i++){
            nums1.push_back(nums2[i]);
        }
        sort(nums1.begin(),nums1.end());

        if(nums1.size()%2 == 0){
            pro = ((double)nums1[ nums1.size()/2-1 ] + (double)nums1[ nums1.size()/2 ]);
        }
        if(nums1.size()%2 == 1){
            pro = (double)nums1[ (nums1.size()-1)/2 ];
        }

        return pro;
    }
};

