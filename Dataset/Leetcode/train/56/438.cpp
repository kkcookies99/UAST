 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        // st, ed is of [0, 1e4]

        vector<int> dp(2*1e4+5, 0);

        int up = 0;
        int down = 2*1e4+5;
        int n = intervals.size();
        // [st, ed] means A_st, A_(st+1)...A_(ed-1)
        // [a, b] all covered= [a, ... , b-1]
        for (int i = 0; i < n; ++i) {
            vector<int>& v = intervals[i];
            int st = 2*v[0], ed = 2*v[1];

            dp[st]++;
            dp[ed+1]--;
            up = max(up, ed);
            down = min(down, st);
        }

        vector<vector<int>> ans;
        for (int i = down; i <= up; ++i) {
            if (i > 0) {
                dp[i] = dp[i] + dp[i-1];
            }            
        }

        dp[up+1] = 0;
        for (int i = down; i <= up;) {
            if (dp[i] == 0) {
                ++i;
                continue;
            }
            for (int j = i; j <= up+1; ++j) {
                if (dp[j] == 0) {
                    vector<int> tmp(2,0);
                    tmp[0] = i/2;
                    tmp[1] = (j-1)/2;
                    ans.push_back(tmp);
                    i = j+1;
                    break;
                }
            }
        }

        return ans;
    }
};

