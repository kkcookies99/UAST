 class Solution {
public:
    string XXX(int n) {
        string ans = "1", pre = ans;
        for(int i = 2; i <= n; i++){
            //细节:还需要记录顺序
            string now;
            char c = pre[0], cnt = 0;
            for(char & t: pre){
                if(c == t){
                    cnt++;
                }
                else{
                    now += to_string(cnt) + c;
                    c = t;
                    cnt = 1;
                }
            }
            if(cnt){
                now += to_string(cnt) + c;
            }
            ans = now;
            pre = now;
        }
        return ans;
    }
};


