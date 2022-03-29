 class Solution {
public:
    vector<string> ans;
    //l_unused 为还未加入的左括号数，r_used为已经加入的右括号数
    void helper(string s,int l_unuesd,int r_used,int n){
       if(l_unuesd > 0) 
            helper(s + '(', l_unuesd-1, r_used,n);
       if(r_used < (n - l_unuesd) && r_used <= n) 
            helper(s + ')', l_unuesd, r_used+1, n);
       if(l_unuesd == 0 && r_used == n) ans.push_back(s);
    }

    vector<string> XXX(int n) {
        helper("", n, 0, n);
        return ans;
    }
};

