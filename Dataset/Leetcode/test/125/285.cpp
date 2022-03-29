 class Solution {
public:
    bool XXX(string s) {
        for (int i=0,j=s.size()-1; i<=j; ){ // 注意s[0]是字符，要与'0'比，而不是0
            if (!(s[i]>='a' && s[i]<='z' || s[i]>='A'&&s[i]<='Z' || s[i]>='0'&&s[i]<='9')){
                i++;
                continue;
            } 
            if (!(s[j]>='a' && s[j]<='z' || s[j]>='A'&&s[j]<='Z' || s[j]>='0'&&s[j]<='9')){
                j--;
                continue;
            } 
            if (!(s[i]==s[j] || (((s[i]<'0'||s[i]>'9') && (s[j]<'0'||s[j]>'9'))&& (s[i]+32==s[j] || s[j]+32==s[i])))) return false;
            i++,j--;
        }
        return true;
    }
};

