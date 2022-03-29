class Solution {
public:
    string XXX(string a, string b) {
        int over = 0;
        int left = 0;
        string ans;

        for (int i = a.size() - 1, j = b.size() - 1; i >= 0 || j >= 0; --i, --j) {
            int val1 = i < 0 ? 0 : a[i] - '0';
            int val2 = j < 0 ? 0 : b[j] - '0';
            left = (val1 + val2 + over) % 2;
            over = (val1 + val2 + over) / 2;
            ans.insert(0, to_string(left));
        }

        if (over) {
            ans.insert(0, to_string(over));
        }

        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


