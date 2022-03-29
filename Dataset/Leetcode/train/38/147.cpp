class Solution {
public:
    string XXX(int n) {
        if (n == 1) return "1";
        string prev = "1";
        string next = "";
        int i = 1;
        while (i < n) {
            char base = prev[0];
            int count = 0;
            for (int j = 0; j < prev.length(); j++) {
                char c = prev[j];
                if (c == base) {
                    count++;
                } else {
                    next += to_string(count) + base;
                    base = c;
                    count = 1;
                }
            }
            next += to_string(count) + base;
            prev = next;
            i++;
            if (i >= n) return next;
            next = "";
        }
        return "";
    }
};

