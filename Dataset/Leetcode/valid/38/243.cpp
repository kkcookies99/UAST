class Solution {
public:
    string XXX(int n) {
        string result = "1";
        for (int i = 1; i < n; ++i) {
            string next;
            int count = 0;
            char cur = result[0];
            for (char c : result) {
                if (c != cur) {
                    next += to_string(count);
                    next.push_back(cur);
                    cur = c;
                    count = 1;
                }
                else {
                    count++;
                }
            }
            next += to_string(count);
            next.push_back(cur);
            result = next;
        }
        return result;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


