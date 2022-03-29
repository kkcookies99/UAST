 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int num1_p = 0;
        int num2_p = 0;
        int cur_pos = 0;
        while(num1_p<m && num2_p < n)
        {
            if(nums2[num2_p] < nums1[cur_pos])
            {
                vector<int>::iterator it = nums1.begin();
                nums1.insert(it+cur_pos,nums2[num2_p]);
                cur_pos++;
                num2_p++;

            }
            else
            {
                num1_p++;
                cur_pos++;
            }            
        }
        if(num1_p==m)
        {
            while(num2_p<n)
            {
               vector<int>::iterator it = nums1.begin();
               nums1.insert(it+cur_pos,nums2[num2_p]); 
               cur_pos++;
               num2_p++;
            }
        }
        nums1.resize(m+n,0);
    }
};

