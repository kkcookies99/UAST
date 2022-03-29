 class Solution {
public:
    string XXX(string s, int numRows) {
        int n = numRows*2-2;
        if(numRows == 1){return s;}
        vector<string> lines(numRows,"");
        for(int  i = 0;i<s.size();i++)
        {
            int t = i%n;
            if(t<=numRows-1){lines[t].push_back(s[i]);}
            else{lines[n-t].push_back(s[i]);}
        }
        string res = "";
        for(auto v:lines)
        {
            res+= v;
        }
        return res;
    }
};

