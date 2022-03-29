 class Solution {
public:
    bool XXX(string s) {
        string simp="";
        for(int i=0;i<s.size();i++){
            if((s[i]<='9'&&s[i]>='0')||(s[i]<='z'&&s[i]>='a')) simp+=s[i];
            else if(s[i]<='Z'&&s[i]>='A') simp+=(char)(s[i]-'A'+'a');
        }
        for(int i=0;i<simp.size()/2;i++) if(simp[i]!=simp[simp.size()-i-1]) return false;
        return true;
    }
};

