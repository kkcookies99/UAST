 class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int length = nums1.size() + nums2.size();
        bool flag = false;
        if(length % 2 == 1)
            flag = true;
        double nidNumber = 0.0, m;
        int i = 0, j = 0, k = 0;
        while(true)
        {
            if(i == nums1.size())
              {  
                  nidNumber = nums2[j];
                  j++;
              }
              else if(j == nums2.size())
              {  
                  nidNumber = nums1[i];
                  i++;
              }
            else if(nums1[i] < nums2[j])
                {
                    nidNumber = nums1[i];
                    i++;
                }
            else
                {
                    nidNumber = nums2[j];
                    j++;
                }
            if(k == length / 2 - 1)
                m = nidNumber;
             if(k == length / 2)
                break;
            k++;
        }
        if(!flag)
            return (nidNumber + m) / 2.0;
        else
            return nidNumber;
    }
};

