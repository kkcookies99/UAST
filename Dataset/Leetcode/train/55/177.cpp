class Solution {
public:
    bool XXX(vector<int>& nums) {

        int n = nums.size();
        vector<bool> arrive(n, 0);

        if( n <= 1 )
            return true;
        arrive[0] = true;

        for( int i = 1 ; i < n ; i ++ ){
            for( int j = i - 1; j >= 0; j -- ){

                if( arrive[j] && nums[j] >= (i-j) ){
                    arrive[i] = true;
                    break;
                }

            }

        }

        return arrive[n-1];



    }
};


