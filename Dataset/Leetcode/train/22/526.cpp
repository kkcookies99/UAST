 class Solution {
public:
    void hs(string current, int n,int left,int right , vector<string>&ans) {
        if (left < n) //可以加左括号
            hs(current + '(', n, left + 1, right, ans);
        if (left > right)//可以加右括号
            hs(current + ')', n, left, right + 1, ans);
        if (right == n)
            ans.push_back(current);

    }

    vector<string> XXX(int n) {
        vector<string>ans;
        hs("(", n, 1, 0, ans);
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


