 double XXX(vector<int>& nums1, vector<int>& nums2) {
        //缓存合并后的数据
        vector<int> combvec;
        int i=0, j=0;

        while(i < nums1.size() || j <nums2.size())
        {
            if(i < nums1.size() && j < nums2.size())
            {
                if(nums1.at(i) < nums2.at(j)) combvec.push_back(nums1.at(i++));
                else if(nums1.at(i) > nums2.at(j)) combvec.push_back(nums2.at(j++));
                else
                {
                    combvec.push_back(nums1.at(i++));
                    combvec.push_back(nums2.at(j++));
                }
            }
            else if(j >= nums2.size())
            {
                combvec.push_back(nums1.at(i++));
            }
            else if(i >= nums1.size())
            {
                combvec.push_back(nums2.at(j++));
            }
        }

        //奇数
        if(combvec.size() % 2 != 0) return (double)combvec.at(combvec.size()/2);
        //偶数
        else
        {
            return (double)(combvec.at(combvec.size()/2) + combvec.at(combvec.size()/2 - 1))/2;
        }
    }
};

