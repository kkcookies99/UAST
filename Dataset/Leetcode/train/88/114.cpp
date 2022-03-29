 class Solution {
public:
    void XXX(vector<int>& nums1, int m, vector<int>& nums2, int n) {

        for( int i = 0 ; i < n ; ++ m , ++ i ){
            
            // 将nums2逐一以插排方式插入nums1
            int k = m;
            while( k > 0 ){
                if( nums1[k-1] <= nums2[i] )
                    break;
                nums1[k] = nums1[k-1];
                -- k ;
            }
            
            nums1[k] = nums2[i];
        } 
    }
};

