 class Solution {
public:
    int XXX(string s) {
        int maxl=0;
        vector<int> sign(128);
        for(int i=0,j=0;i<s.size();i++){
            ++sign[(int)(s[i])];
            while(sign[(int)(s[i])]>1) {
                sign[(int)(s[j])]--;
                j++;
            }
            maxl=max(maxl,i-j+1);
        }
        return maxl;
    }
};

