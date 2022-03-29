class Solution {
public:
    unordered_map<int, int> memo;
    int dp(int n){
        if(memo.count(n) == true){
            return memo[n];
        }
        if(n == 0){
            return 1;
        }else if (n < 0){
            return 0;
        }else{
            int subproble = dp(n-1) + dp(n-2);
            memo[n] = subproble;
            return subproble;
        }
    }
    int XXX(int n) {
        return dp(n);
    }
};
