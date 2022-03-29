 class Solution {
public:
    string XXX(string s, int numRows) {
        string res;
        if(s.empty() || numRows<1)return res;
        int sl = s.size();
        if(numRows==1 || sl<=numRows)return s;

        for(int i=0;i<numRows;++i){
            int j=i;
            res+=s[j];
            while(j<sl){
                int k=(numRows-i)*2-2;
                if(k>0){
                    j+=k;
                    if(j<sl)
                        res+=s[j];
                    else
                        break;
                }
                k=i*2;
                if(k>0){
                    j+=k;
                    if(j<sl)
                        res+=s[j];
                    else
                        break;
                }
            }
        }

        return res;
    }
};

