 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int k = numRows - 2;
        int mod = numRows + k;

        string n_s(s);

        //map<int, vector<int>> m;

        vector<vector<int>> m(s.length()+1);

        for (int i = 0; i < s.length(); ++i) {
            int new_index = (i % mod);
            if (new_index >= numRows) {
                new_index = (mod-new_index);
            }
            m[new_index].push_back(i);
        }

        int tmp = 0;
        int cur_index = 0;
        while(tmp < numRows && tmp < s.length()) {
            vector<int> cur = m[tmp];
            for (int i = 0; i < cur.size(); ++i) {
                n_s[cur_index] = s[cur[i]];
                cur_index++;
            }
            tmp++;
        }
        return n_s;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


