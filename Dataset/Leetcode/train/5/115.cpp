 class Solution {
public:
    string XXX(string s) {
        if (s.size() < 2) return s;
        int start = 0, end = 0;
        for (int i = 0; i < s.size(); ++i) {
            center(s, i, i, start, end);
            center(s, i, i+1, start, end);
        }
        return s.substr(start, end-start+1);
    }
private:
    void center(string& s, int left, int right,int& start, int& end) {
        while (left >= 0 && right < s.size() && s[left] == s[right]) {
            --left;
            ++right;
        }
        if ((right-left-1) > (end-start+1)) { 
            start = left + 1;
            end = right - 1;
        }
    }
};

