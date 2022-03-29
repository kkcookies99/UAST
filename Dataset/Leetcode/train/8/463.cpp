 class Solution {
public:
    bool positive;
    string preset(string &s){
        string res;
        int i=0;
        while(i<s.size()&&s[i]==' ')i++;
        if(i<s.size()){
            if(s[i]=='-')positive=false;
            else if(s[i]=='+')positive=true;
            else i--;
            i++;
        }
        for(;i<s.size();i++){
            if(s[i]>='0'&&s[i]<='9'){
                res+=s[i];
            }else break;
        }
        if(res.empty())return "0";
        return res;
    }
    int XXX(string s) {
        positive=true;
        string res=preset(s);
        if(res=="0")return 0;  
        long long down=static_cast<long long>(INT_MIN)*(-1);
        long long num=0;
        for(int i=0;i<res.size();i++){
            num*=10;
            num+=(res[i]-'0');
            if(positive&&num>INT_MAX)return INT_MAX;
            if(!positive&&num>down)return INT_MIN;
        }
        if(!positive)num=-num;
        return num;
    }
};

