 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) 
    {
        if(nums.size()<3) return {};
        this->init(nums);
        vector<vector<int>> rs;    // result
        if(_zero > 2) rs.push_back({0,0,0}); // {0, 0, 0}
        int *start = &_values[0];
        int *end  = _values.size() - 1 + start;
        for(int *p=start; p<=end; p++)
        {   
            if(*p >= 0) break;
            int *left  = p;
            int *right = end;
            while(left<=right)
            {
                int add = *left + *right;
                if(add == -*p) // find
                {
                    if(left == p     && !_marks[left-start]) {left++; right--; continue; }
                    if(left == right && !_marks[left-start]) {left++; right--; continue; }
                    rs.push_back({*p, *left, *right});
                    left++; right--;
                }
                else if(add > -*p) right--;
                else if(add < -*p) left++;
            }
        }
        return rs;
    }

    
    /** 初始化 */
    void init(vector<int>& nums)
    {
        map<int, bool> plusMap;    // plus  value to  map
        for(int i=0; i<nums.size(); i++)
        {
            if(nums[i] == 0) _zero++;
            plusMap[nums[i]] = (plusMap.find(nums[i]) != plusMap.end());
        }
        for(auto it = plusMap.begin(); it!=plusMap.end(); it++)
        {
            _values.push_back(it->first);
            _marks.push_back(it->second);
        }
    }
    
private:
    int _zero = 0;              // zero
    vector<int> _values;        // values with no repeat
    vector<bool> _marks;        // repeat or not
};

