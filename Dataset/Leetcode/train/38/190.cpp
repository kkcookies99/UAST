class Solution {
    int num;
    string Get(string s,int now){
        if(now==num) return s;
        int len=s.size();
        string t="";
        int i=0,j=0;
        while(j<len){
            while(j+1<len && s[j+1]==s[j]) j++;
            t+=j-i+1+'0';
            t+=s[j];
            j++;
            i=j;
        }
        return Get(t,now+1);
    }
public:
    string XXX(int n) {
        num=n;
        return Get("1",1);
    }
};

