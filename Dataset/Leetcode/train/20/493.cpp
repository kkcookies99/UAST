 class Solution {
public:
    bool XXX(string s) {
        unordered_set<char> char_set({ '(', '[', '{' });
        stack<char> quote;
        for (char c : s) {
            if (char_set.count(c)) quote.push(c);
            else if (not checkQuote(quote, c)) return false;
            else quote.pop();
        }
        return quote.empty();
    }
    bool checkQuote(stack<char> &quote, char c) {
        if (quote.empty()) return false;
        return pairQuote(quote.top(), c);
    }
    bool pairQuote(char c1, char c2) {
        for (const char *s : {"()", "[]", "{}"}) {
            if (s[0] == c1 and s[1] == c2) return true;
        }
        return false;
    }
};

