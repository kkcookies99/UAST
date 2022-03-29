 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i=m-1, j=n-1;
        for(int k = m+n-1; k>=0;--k){
            if(i>=0&&j>=0)
            ///num1从后向前重新赋值，值为两指针的更大者,赋值后对应指针左移///
                nums1[k] = (nums1[i]>nums2[j])?nums1[i--]:nums2[j--];
            ///当i,j任意一个越界时特殊处理///        
            else if(i<0)
                nums1[k]=nums2[j--];
            else if(j<0)
                break;
        }
    }
};

