 class Solution {
public:
    string XXX(int n) {
        if(n == 1) return "1";
        ostringstream ans;
        string pre = XXX(n-1);
        int count = 1;
        for (int i = 0; i < pre.size(); i++) {
            if(pre[i] == pre[i+1]) {
                count++;
                continue;
            }
            ans << count << pre[i];
            count = 1;
        }
        return ans.str();
    }
};

