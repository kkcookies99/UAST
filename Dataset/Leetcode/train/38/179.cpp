class Solution {
public:
    string XXX(int n) {
        if(n == 1) return "1";
        string prev = XXX(n - 1);
        string cur;
        for (int i = 0; i < prev.size(); i++) {
            int j = i; //记录起点位置
            while (i < prev.size() - 1 && prev[i] == prev[i + 1]) i++;
            cur += to_string(i - j + 1) + prev[i];
        }
        return cur;
    }
};

