 class Solution {
public:
    int XXX(string s) {
        if (s.size() == 0) return 0;
        unordered_set<char> set;
        int left = 0, right = 0, maxLength = 0;
        while (right < s.size()) {
            if (set.find(s[right]) == set.end()) {
                set.insert(s[right]);
                if (right - left + 1 > maxLength) maxLength = right - left + 1;
                ++right;
            } else {
                while (left < right && set.find(s[right]) != set.end()) {
                    set.erase(s[left]);
                    left++;
                }
            }            
        }
        return maxLength;
    }
};

