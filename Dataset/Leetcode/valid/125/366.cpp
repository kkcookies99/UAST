 class Solution {
public:
    bool XXX(string s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !valid(s[left ])) ++left;
            while (left < right && !valid(s[right])) --right;
            if (correct(s[left]) != correct(s[right])) return false;
            ++left, --right;
        }

        return true;
    }

    bool valid(char c) {
        if ('0' <= c && c <= '9') return true;
        if ('a' <= c && c <= 'z') return true;
        if ('A' <= c && c <= 'Z') return true;
        return false;
    }
    char correct(char c) {
        if ('A' <= c && c <= 'Z') return c + ('a' - 'A');
        return c;
    }
};

