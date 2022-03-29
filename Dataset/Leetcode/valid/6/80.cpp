 class Solution {
public:
    string XXX(string s, int numRows) {
        string ans;
        int nlen = s.size();
        int left = 0, right = 2*numRows-2;
        if(numRows == 1) return s;
        for(int i = 0; i<numRows; ++i){
            int templ = left, tempr = right;
            if(i == 0 || i == numRows-1){
                while(templ<nlen){
                    ans += s[templ];
                    templ += 2*numRows-2;
                }
            }
            else{
                while(templ<nlen){
                    ans += s[templ];
                    if(tempr<nlen) ans += s[tempr];
                    templ += 2*numRows-2;
                    tempr += 2*numRows-2;
                }
            }
            left++;
            right--;
        }
        return ans;
    }
};

