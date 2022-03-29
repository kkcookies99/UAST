class Solution {
public:
    string XXX(int n) {
        if(n==1)return "1";
        string res="",s1;
        s1 = "1";
        n=n-1;
        while(n--){
            res = toDo(s1);
            s1 =res;
        }
        return res;
    }

    string toDo(string s){
        string res="";
        int len = s.length();
        int num=0;
        char c;
        for(int i=0;i<len;i++){
            char c=s[i];
            num++;
            if(s[i]==s[i+1]&&i!=len-1){
                
            }
            else {
                res=res+to_string(num);
                res=res+c;
                num=0;
            }
        }
        return res;
    }
};

