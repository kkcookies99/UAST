 class Solution {
public:
    int XXX(string s) {
        int n = s.size();
        if(n<=1) return n;
        int left = 0 , right = 0;
        int ans = 0;
        unordered_set<char> window;
        while(right<s.size()){
            char c = s[right];
            while(window.count(c)){
                window.erase(s[left++]);
            }
            ans = max(right-left+1,ans);
            window.insert(s[right++]);
        }
        return ans;
    }
};

