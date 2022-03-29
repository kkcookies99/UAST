 class Solution {
public:
    int XXX(string haystack, string needle) {
        int n1 = haystack.size(), n2 = needle.size();
        if (n2>n1) return -1;
        if (n2==0) return 0;
        // save the first seq index
        queue<int> pre;
        for (int i=0; i<n1; i++) {
            if (needle[0]==haystack[i]) pre.push(i);
        }
        while (!pre.empty()) {
            int first = pre.front();
            pre.pop();
            int flag = 1;
            if (first+n2>n1) {
                continue;
            }
            for (int i=first; i<first+n2; i++) {
                if (haystack[i]!=needle[i-first]) {
                    flag = 0;
                }
            }
            if (flag) {
                return first;
            }
        }
        return -1;
    }
};

