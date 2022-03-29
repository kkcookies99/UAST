 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        vector<int>vec3;
		vec3.resize(nums1.size()+nums2.size());
		merge(nums1.begin(),nums1.end(),nums2.begin(),nums2.end(),vec3.begin());
        sort(vec3.begin(), vec3.end());
        int num = vec3.size();
        if(num%2 == 0)
        {
            return (vec3[num/2]+vec3[num/2-1])/2.0;
        }
        else
        {
            return vec3[num/2];
        }


    }
};

