 class Solution {
public:
    int M, N;
    int res = 0;
    map<string, int> memo;
    void backtrack(int x, int y){
        if(x == M && y == N){
            res ++;
            return ;
        }
        
        if(x+1 <= M) {
            string x_str = "X";
            string y_str = "Y";
            x_str[0] = '0' + x+1;
            y_str[0] = '0' + y;
            string find_str = x_str + "_" + y_str;
            if(memo.count(find_str) > 0){
                res += memo[find_str];
            }else{
                int k = res;
                backtrack(x+1, y);
                memo[find_str] = res - k;
            }
        }
        if(y+1 <= N){
            string x_str = "X";
            string y_str = "Y";
            x_str[0] = '0' + x;
            y_str[0] = '0' + y + 1;
            string find_str = x_str + "_" + y_str;
            if(memo.count(find_str) > 0){
                res += memo[find_str];
            }else{
                int k = res;
                backtrack(x, y+1);
                memo[find_str] = res - k;
            }
        }
    }
    int XXX(int m, int n) {
        M = m, N = n;
        backtrack(1, 1);
        return res;
    }
};

