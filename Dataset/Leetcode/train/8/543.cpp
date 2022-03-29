 class Solution {
public:
    int XXX(string s) {
        for(int i=0;i<s.length();i++){
            if(s[i]==' '||s[i]=='-'||s[i]=='+')continue;
            if(s[i]>='0'&&s[i]<='9'){
                int ans;
                stringstream ss;
                ss<<s;
                ss>>ans;
                return ans;
            }
            return 0;
        }
        return 0;      
    }
};

