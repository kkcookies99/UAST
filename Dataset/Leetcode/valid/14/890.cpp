 class Solution {
public:
    string XXX(vector<string>& ss) {
        int n = ss.size();
        if (!n) return "";
        vector<int> lens;
        for (int i = 0; i < n; i++) {
            lens.push_back(ss[i].size());
        }
        pair<int, int> min_len_idx = {0x3f3f3f3f, 0};
        for (int i = 0; i < n; i++) {
            if (lens[i] < min_len_idx.first) min_len_idx = {lens[i], i};
        }
        cout << min_len_idx.first << '-' << min_len_idx.second << endl;
        if (!min_len_idx.first) return "";
        //string res = "";
        for (int i = 0; i < min_len_idx.first; i++) {
            char c = ss[min_len_idx.second][i];
            bool match = true;
            for (int j = 0; j < n; j++) {
                if (ss[j][i] != c) {
                    match = false;
                    break;                    
                }
            }
            if (!match) return ss[min_len_idx.second].substr(0, i);
        }
        return ss[min_len_idx.second];
    }
};

