 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1)
        {
            return s;
        }
        vector<string> vs(numRows,"");
        int j = 0;
        for(int i = 0; i<s.size(); i+=(2*numRows-2)){
            for( j=0; j<2*numRows-2 && (j+i)<s.size() ; j++ )
            {
                if(j<numRows)
                    vs[j] += char(s[i+j]);
                else
                    vs[2*numRows-2-j] += char(s[i+j]);
            }
        }
        s.clear();
        for(j = 0; j<numRows; ++j)
        {
            s+=vs[j];
        }
        return s;
    }
};

