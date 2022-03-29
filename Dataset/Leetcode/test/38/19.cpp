class Solution {
public:
    string XXX(int n) {
        if(n == 1) return "1";
        string pre = XXX(n-1), ans;
        int count = 1;
        for(int i = 0; i < pre.size(); i++)
        {
            if(pre[i] != pre[i + 1])
            {
                ans += (count + '0');
                ans += pre[i];
                count = 0;
            }
            count++;
        }
        return ans;
        
    }
};

