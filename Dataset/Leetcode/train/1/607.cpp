 vector<int> XXX(vector<int>& nums, int target) {
    vector<int> res;
    if ( nums.empty() ) return res;
    std::unordered_map<int , int > diff_val;
    for ( int idx = 0; idx < nums.size(); idx++ ) {
        if ( diff_val.count( target - nums[idx] ) > 0 ) {
            res.push_back( diff_val[target - nums[idx]] );
            res.push_back( idx );
            return res;
        }
        else {
            diff_val[nums[idx]] = idx;
        }
    }
    
    return res;
}
