class Solution {
public:
    int XXX(string s) {
        int n = s.size();
        int right=n-1, left;
        while(right>=0 &&s[right] == ' ') right--;
        left = right-1;
        while(left >= 0 && s[left] != ' ') left--;
        return right - left;
    }
};

