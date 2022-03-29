 class Solution {
public:
    string XXX(int n) {
        if(n==1)
            return "1";
        if(n==2)
            return "11";
        string s = XXX(n-1);
        int len = s.size();
        char pre = s[0];
        string res = "";
        int count=1;
        for(int i=0;i<len;++i){
            if(i<len-1 && pre == s[i+1]){
                count++;
                continue;
            }
            else{
                res = res + to_string(count) + pre;
                if(i<len-1){
                    pre = s[i+1];
                    count = 1;
                }
            }
        }
        return res;
    }
};

