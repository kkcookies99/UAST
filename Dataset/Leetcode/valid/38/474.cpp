 class Solution {
public:
    string XXX(int n) {
        if(n == 1){
            return "1";
        }
        //
        return prase(XXX(n - 1)); 
    }
    string prase(string n){
        string ans = "";
        char cur_char = n[0];
        int cur_cnt = 1;
        for(int i = 1; i < n.size(); ++i){
            if(n[i] == n[i-1]){
                cur_cnt++;
            }else{
                ans += to_string(cur_cnt);
                ans += cur_char;
                cur_cnt = 1;
                cur_char = n[i];
            }
        }
        ans += to_string(cur_cnt);
        ans += cur_char;
        return ans;
    }
};

