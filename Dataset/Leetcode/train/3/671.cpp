 class Solution {
public:
    int XXX(string s) {
        int ans = 0;
        int n = s.length();
        if (n <= 1)
            return n;
        unordered_set<char> mp;
        int label = 0;
        for (int i = 0; i < n; i++){
            if (mp.find(s[i]) == mp.end())
                if (i == n-1)
                    ans = max(i - label + 1, ans);
                else
                    mp.insert(s[i]);
            else{
                ans = max(i - label, ans);
                while (s[label] != s[i]){
                    mp.erase(s[label]);
                    ++label;
                }
                ++label;
            }
        }
        return ans;
    }
};

