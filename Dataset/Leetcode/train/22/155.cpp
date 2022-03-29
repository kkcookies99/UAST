 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> ans;
        string tmp = string();
        int left = 0, right = 0;
        function<void(void)> dfs = [&](){
            if (right == n) {
                ans.push_back(tmp);
                return;
            }
            if (left < n) {
                tmp.push_back('(');
                left++;
                dfs();
                left--;
                tmp.pop_back();
            }
            if (left > right) {
                tmp.push_back(')');
                right++;
                dfs();
                right--;
                tmp.pop_back();
            }
        };
        dfs();
        return ans;
    }
};

