 class Solution {
public:
    double XXX(vector<int>& nums1,vector<int>& nums2) {
     int s1 = nums1.size(), s2 = nums2.size();
    if (s2 > s1)
            return XXX(nums2, nums1);
    for (int i = 0; i < s2; i++)
            nums1.push_back(0);

        int s = nums1.size();
        int mid = (s-1) / 2;

        int i = s1 - 1, j = s2 - 1, k = s - 1;
        for (; i >= 0 && j >= 0; ) {
            if (nums1[i] > nums2[j]) 
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];    
        }
        if (i == 0 && j != 0)
            for (; j >= 0;)
                nums1[k--] = nums2[j--];
        else if (i != 0 && j == 0)
            for (; i >= 0;)
                nums1[k--] = nums1[i--];

        if(s % 2 == 1)
            return nums1[(s-1) / 2];
        else
           return (double)(nums1[(s - 1) / 2]+nums1[(s - 1) / 2 + 1])/2.0;
    }
};

