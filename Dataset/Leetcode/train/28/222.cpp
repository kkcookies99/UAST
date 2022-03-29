 class Solution {
public:
    static vector<int> buildNext(string str) {
        vector<int> next;
        next.resize(str.size());
        next[0] = -1;

        for (int j = 0; j < str.size(); j++) {
            if (next[j] == -1 || str[j] == str[next[j]]) {
                next[j + 1] = next[j] + 1;
            } else if (next[j] == 0) {
                next[j + 1] = 0;
            } else {
                next[j + 1] = next[next[j]];
            }
        }

        return next;
    };

    static int XXX(string haystack, string needle) {
        if (needle.empty()) {
            return 0;
        }

        int size = needle.size();
        if (haystack.size() < size) {
            return -1;
        }
        const vector<int> &next = buildNext(needle);

        int i = 0;
        int j = 0;

        while (i < haystack.size() && j < size) {
            if (j == -1 || haystack[i] == needle[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }

        if (j == size) {
            return i - j;
        }
        return -1;
    };
};