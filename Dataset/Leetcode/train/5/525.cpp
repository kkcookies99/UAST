 class Solution {
public:
    string XXX(string s) {
        int n = s.size();
        vector<vector<int>> f(n,vector<int>(n,0));
        for(int i = 0; i < n; i ++)
            f[i][i] = 1;
        int len = 1,st = 0;
        for(int k = 2; k <= n; k ++){
            for(int i = 0; i < n; i ++){
                int j = i + k - 1;
                if(j >= n) break;
                if(s[i] == s[j] && (f[i+1][j-1] || i + 1 == j)){
                    f[i][j] = 1;       
                    if(k > len){
                        len = k;
                        st = i;
                    }
                }
            }
        }
        return s.substr(st,len);
    }
};

