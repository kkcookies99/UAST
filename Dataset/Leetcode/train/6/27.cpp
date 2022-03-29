 class Solution {
public:
    string XXX(string s, int numRows) {
        vector<string> res(numRows,"");
        string resstr;
        int flag=-1,idx=0;
        if(numRows<2)
            return s;
        for(int i=0;i<s.length();i++){
            res[idx]+=s[i];
            if(idx==0||idx==numRows-1)
                flag=-flag;
            idx+=flag;
        }
        for(int i=0;i<res.size();i++){
            resstr+=res[i];
        }
        return  resstr;
    }
};

