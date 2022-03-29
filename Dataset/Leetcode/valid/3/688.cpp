 class Solution {
public:
    int XXX(string s) {
        unordered_map<char,int> map;
        int count = 0,temp = 0;
        string::size_type len = s.size();
        for(auto i = 0; i < len;++i)
        {
            if(map.count(s[i]))
            {
                count = max(count,temp);
                i =  map[s[i]];
                map.clear();
                temp = 0;
            }else{
                map[s[i]] += i;
                ++temp;
            }
        }
        count = max(count,temp);
        return count;
    }
};


