 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        vector<int>::iterator it1 = nums1.begin();
        vector<int>::iterator it2 = nums2.begin();
        vector<int> nums_total;
        while (it1 != nums1.end() || it2 != nums2.end())
        {
            if (it1 != nums1.end() && it2 != nums2.end())
            {
                int t1 = (*it1);
                int t2 = (*it2);
                if (t1 < t2)
                {
                    nums_total.push_back(t1);
                    it1++;
                }
                if (t1 > t2)
                {
                    nums_total.push_back(t2);
                    it2++;
                }
                if (t1 == t2)
                {
                    nums_total.push_back(t1);
                    nums_total.push_back(t2);
                    it1++;
                    it2++;
                }
            }
            else if (it1 != nums1.end() || it2 != nums2.end())
            {
                if (it1 != nums1.end())
                {
                    int t1 = (*it1);
                    nums_total.push_back(t1);
                    it1++;
                }
                if (it2 != nums2.end())
                {
                    int t2 = (*it2);
                    nums_total.push_back(t2);
                    it2++;
                }
            }
        }
        if (nums_total.size() % 2 == 0)
        {
            int sn1 = nums_total.size() / 2 - 1;
            double ret = (nums_total[sn1] + nums_total[sn1 + 1]) / 2.0;
            return ret;
        }
        int n = nums_total.size();
        int sn1 = 0;
        while (n > 2)
        {
            n -= 2;
            sn1++;
        }
        return nums_total[sn1];
    }
};

