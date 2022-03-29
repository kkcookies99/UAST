 class Solution {
public:
    int XXX(vector<int>& v, int val) {
        for (auto it = v.begin(); it != v.end(); it++) {
            if (*it == val) {
                v.erase(it);
                it--;
            }
        }
        return v.size();
    }
};

