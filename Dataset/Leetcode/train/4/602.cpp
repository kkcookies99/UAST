 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
    if(nums1.size() == 0 && nums2.size() ==0)
    return 0;

    for(auto it1 = nums2.begin(); it1 != nums2.end(); it1++){
            auto it2 = nums1.begin();
        for(; it2 != nums1.end(); it2++){
            if(*it2 >= *it1){
                nums1.insert(it2, *it1);
                break;
            }
        }
        if(it2 == nums1.end())
            nums1.push_back(*it1);
    }
        if(nums1.size()%2 == 0)
            return (nums1[nums1.size()/2] + nums1[nums1.size()/2 - 1])/2.0;
        else
            return nums1[nums1.size()/2];
    return {};
    }
};

