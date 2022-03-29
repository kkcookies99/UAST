class Solution {
public:
    int XXX(int n)
    {
        if(n <= 2) return n; 
        int ans = 0;
        int prepre = 1; //上上次
        int pre = 2;    //上次
        for(int i = 2; i < n; i++)
        {
            ans = pre + prepre;
            prepre = pre;
            pre = ans;
        }
        return ans;
    }
};

