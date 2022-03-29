 class Solution {
public:
    string XXX(string s, int numRows) {
        while(numRows==1||s.size()<=numRows){
            return s;
        }
        vector<vector<char> >c(numRows);
        int i=0;
        while(i<s.size()){
            int n=numRows;
            int m=numRows-2;
            while(n&&i<s.size()){
                c[numRows-n].push_back(s[i++]);
                n--;
            }
            while(m&&i<s.size()){
                c[m].push_back(s[i++]);
                m--;
            }
        }
        string ans="";
        for(int i=0;i<numRows;++i){
            for(auto j:c[i]){
                ans+=j;
            }
        }
        return ans;
    }
};

