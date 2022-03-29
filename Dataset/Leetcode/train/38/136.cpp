class Solution {
public:
    string getStr(string& str){
        string res; 
        int n = str.size();
        int idx = 0;
        while(idx < n){
            int cnt = 1;
            char c = str[idx];
            while(idx < n && str[idx] == str[idx+1]){
                ++idx;
                ++cnt;
            }
            res += to_string(cnt) + c;
            ++idx;
        }
        return res;
    }
    string XXX(int n) {
        if(n == 1)
            return "1"; 
        string str = "1";
        for(int i = 2; i <= n ; i++){
            str = getStr(str);
        }
        return str;
    }
};

