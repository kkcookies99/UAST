 class Solution {
public:
    vector<string> XXX(int n) {
        // 回溯法（使用递归）
        int state = 0;
        string bracket= "()";
        string temp = "";
        vector<string> ans;  
        back(2 * n, temp, state, bracket, ans);
        return ans;
    }

    void back(int n, string& temp, int& state, string& base, vector<string>& ans){
        if(temp.length() == n) {
            if(state == 0)
                ans.push_back(temp);
            return;
        }
        for(int i = 0; i < 2; i++){
            if(i == 0) state++;
            else state--;
            if(state > n / 2){
                if(i == 0) state--;
                else state++;
                continue;
            }
            if(state < 0){  
                if(i == 0) state--;
                else state++;
                return;
            }else{
                temp.push_back(base[i]);
                back(n, temp, state, base, ans);
                temp.erase(temp.end() - 1);
                if(i == 0) state--;
                else state++;
            }
        }
    }
};

