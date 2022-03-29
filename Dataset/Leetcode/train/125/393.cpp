 class Solution {
public:
    bool XXX(string s) {
        if(s.empty()) return true;

        for(int i=0; i<s.length(); i++){
            if((s[i]>='a' && s[i]<='z') || (s[i]>='0' && s[i]<='9')) continue;
            else if(s[i]>='A' && s[i]<='Z') s[i] += 32;  // 大写转小写
            else s[i] = 0;
        }

        int i = 0, j = s.length()-1;
        while(i<j){
            while(!s[i] && i<j) i++;
            while(!s[j] && i<j) j--;
            if(i==j) return true;

            if(s[i] == s[j]){
                i++;
                j--;
            }
            else return false;
        } 
        return true;
    }
};

