 class Solution {
public:
    int XXX(vector<int>& v, int target) {
        for (int i = 0; i < v.size()-1; i++) {
            if (v[i] < target) {
                if (v[i+1] >= target) {
                    return i+1;
                }
            }
        }
        if (target < v[0]) return 0;
        else if (target > v[v.size()-1]) return v.size();
        return 0;
    }
};

