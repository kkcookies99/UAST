 class Solution {
public:
    string XXX(vector<string>& strs) {
        string s = "";
        char c ;
        int i = 0;
        bool flag = true;
        if (strs.size() == 1) 
            return strs[0];
        while (i!=strs[1].size()) {
            c = strs[0][i];
            for (int j=0; j!=strs.size(); j++) {
                if (strs[j] == "") {
                    flag = false;
                    s = "";
                }
                if (strs[j][i] != c) {
                    flag = false;
                    break;
                } 
            }
            if (!flag) {
                break;
            } else {
                s.push_back(c);
            }
            i++;
        }
        return s;
    }
};

用时4ms, 有点逃课的感觉，复杂度应该是O(n*m)吧（猜
