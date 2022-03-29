class Solution {
    string say(string s){
        //i和j初始位置都在索引0处
        int i=0,j=0;
        string res="";
        while(j<s.length()){
            if(s[i]!=s[j]){
                res.push_back(j-i+'0');
                res.push_back(s[i]);
                i=j;
            }//当s[i]和s[j]不同时，先将s[i]的数目送入结果，再将s[i]送入结果
            if(j==s.length()-1&&s[i]==s[j]){
                res.push_back(j-i+1+'0');//此时是最后一组数，所以必须j-i+1代表其数目
                res.push_back(s[i]);
                i=j;
            }
            if(s[i]==s[j]){
                j++;
            }
        }
        return res;
    }
public:
    string XXX(int n) {
        string s="1";
        //if(n==1)return s;
        for(int i=1;i<n;i++){
            s=say(s);
        }
        return s;
    }
};