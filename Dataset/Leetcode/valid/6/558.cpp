 class Solution {
public:
    string XXX(string s, int numRows) {
        int len = s.length(), n = numRows;
        if(n < 1) return NULL;
        if(n == 1) return s;
        vector<string> res(n);
        for(int i = 0; i < len; i++)
        {
            int k = i%(2*n-2);
            if(k <= n-1)
            {
                res[k] += s[i];
            }
            else
            {
                res[n-k%(n-1)-1] += s[i];
            }
        }
        string ans;
        for(int i = 0; i < res.size(); i++)
        {
            ans += res[i];
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


