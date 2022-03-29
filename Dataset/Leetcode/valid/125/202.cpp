 class Solution {
public:
    bool XXX(string s) {
        string a="";
        for(int i=0;i<s.size();i++){
            if((s[i]-'a'>=0&&'z'-s[i]>=0)||(s[i]-'0'>=0&&'9'-s[i]>=0))
                a+=s[i];
            if(s[i]-'A'>=0&&'Z'-s[i]>=0)
                a+=s[i]-'A'+'a';
        }
        s=a;
        for(int i=0;i<s.size();i++){
            if(s.size()-1-i<=i)
                break;
            if(s[s.size()-1-i]!=s[i])
                return false; 
        }
        return true;
    }
};

