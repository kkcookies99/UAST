 class Solution {
public:
    vector<vector<int>> XXX( vector<int> & nums ) {
        vector<vector<int>> res;
        res.push_back( {} );
        
        for ( int var : nums ) {
            int n = res.size();
            for ( int j = 0; j < n; ++j ) {
                res.push_back( res[j] );
                res.back().push_back( var );
            }
        }
        return res;
    }
};

