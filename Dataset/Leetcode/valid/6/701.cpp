 class Solution {
public:
    string XXX(string s, int numRows) {
        vector<string> vec(numRows);
        string res = "";
        int i = 0, k = -1;
        int len = s.size();
        if(numRows==1)
            return s;
        for(int j=0;j<len;j++){
            vec[i].push_back(s[j]);
            if(i==numRows-1 || i==0)
                k*=-1;
            i+=k;
        }
        for(int p=0; p<numRows; p++)
            res+=vec[p];
        return res;
    }
};

