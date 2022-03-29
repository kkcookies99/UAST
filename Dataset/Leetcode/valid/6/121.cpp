 class Solution {
public:
    string XXX(string s, int numRows) {
        if(s.size()<numRows)
            return s;
        vector<vector<char>> strs(numRows,vector<char>('0'));
        int i=0,k=0;
        while(i<s.size()){
            int j=0;
            while(j<numRows&&i<s.size())
                strs[j++][k]=s[i++];
            k++;j=1;
            while(j<numRows-1&&i<s.size())
                strs[j++][k]=s[i++];
            k++;
        }
        string result="";
        for(int i=0;i<strs.size();i++)
            for(int j=0;j<strs[i].size();j++){
                if(strs[i][j]!='0')
                    result+=strs[i][j];
            }
        return result;
    }
};

