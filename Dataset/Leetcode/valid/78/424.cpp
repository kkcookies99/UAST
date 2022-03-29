 class Solution {
public:
    /* 
    nums.size() == binary digits ( number : b )
    subset's size == the scope of b
    from zero to size - 1
    ex:
    1,2,3 sz = 2^3 = 8 ; size = 3
    when i = 2 -> n = 1 -> j = [1,0] -> p = 2^1 = 2 ( 010 )
    if ( 2 & 2 == 1 ) -> idx = 3 - 1 - 1 = 1 -> nums[1] = 2 -> asub.push(2) ; bingo

    */
    vector<vector<int>> XXX(vector<int>& nums) {
        int size = nums.size() ;
        int sz = pow( 2 , size ) ; // the size of binary digits
        vector < vector < int > > ans ;
        ans.push_back( {} ) ;
        for ( int i = 1 ; i < sz ; ++ i )
        {
            vector < int > asub ;
            int n = log( i ) / log( 2 ) ; // the key argument, TRUNCATE
            for ( int j = n ; j >= 0 ; -- j )
            {
                int p = pow( 2 , j ) ;
                if ( ( i & p ) != 0 ) // equals : if ( i & 1 << j )
                {
                    int idx = size - 1 - j ;
                    asub.push_back( nums[idx] ) ;
                }
            }
            ans.push_back( asub ) ;
        }
        return ans ;
    }
};

