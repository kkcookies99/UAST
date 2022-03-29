 class Solution {
public:
    vector<int> XXX( vector<int>& nums, int target ) {
        if( nums.size() < 2)
            return vector<int>();
        map<int,int> m;
        map<int,int>::iterator j;
        vector<int> result;
        int complement;
        int i;
        for(  i = 0; i < nums.size(); ++i ) {
            complement = target - nums[i];
            j = m.find( complement );
            if( j != m.end() )
                break;
             m.insert( make_pair(nums[i],i) );
        }
        if( i < nums.size() ) {
            result.push_back(j->second);
            result.push_back(i);
        }
        return result;
    }
};

