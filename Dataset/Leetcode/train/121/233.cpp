 class Solution {
public:
    int XXX(vector<int>& prices) {
        int minn = 9999;
        int ans = 0;
        for(int x : prices){
            minn = min(minn , x);
            ans = max(ans , x - minn);
        }
        return ans;
    }
};

