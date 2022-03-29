 class Solution {
public:
    bool XXX(string s) {
        transform(s.begin(),s.end(),s.begin(),::tolower);
        int n=s.size();
        string str;
        int len=0;
        for(int i=0;i<n;i++){
            if((s[i]>='a'&&s[i]<='z')||(s[i]>='0'&&s[i]<='9')){
                str.push_back(s[i]);
                s[len++]=s[i];
            }
        }
        reverse(str.begin(),str.end());

        return str==s.substr(0,len);
    }
};

