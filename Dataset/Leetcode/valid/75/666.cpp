 class Solution {
public:
    void XXX(vector<int>& nums) {
        int length = nums.size();
        if( length == 0 )
            return;
        QuickSort3Ways( nums, 0, length - 1 );
        
    }
    void QuickSort3Ways( vector<int>& nums, int l, int r )
    {
        if( l >= r )
            return;
        int val = nums[l];
        int lt = l;
        int i;
        int j = r + 1;
        for( i = l + 1; i < j; ) {
            if( nums[i] == val ) {
                i++;
            }
            else if( nums[i] > val ) {
                j--;
                std::swap( nums[i], nums[j] );
            }
            else {
                lt++;
                std::swap( nums[lt], nums[i] );
                i++;
            }
        }
        std::swap( nums[l], nums[lt] );
        QuickSort3Ways( nums, l, lt - 1 );
        QuickSort3Ways( nums, j, r );
    }
};

