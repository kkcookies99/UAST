 class Solution {
public:
    string XXX(string s, int numRows) {
        if( numRows == 1 ) 
            return s;
        vector<string> vec(numRows);
        int i = -1;
        int index = 1;
        vec[0].push_back(s[0]);

        while(index < s.size()){
            ++i;
            while( index < s.size() && ++i < numRows )
                vec[i].push_back(s[index++]);

            --i;
            while( index < s.size() && --i >= 0 )
                vec[i].push_back(s[index++]);
        }

        string res;
        for(auto& s : vec)
            res += s;
        return res;
    }
};

