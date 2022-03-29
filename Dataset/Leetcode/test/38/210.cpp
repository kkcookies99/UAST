class Solution {
public:
    string XXX(int n) {
        if (n == 1) return "1";
        string target = "11";
        for (int j = 1; j < n - 1; ++j) {
            string temp;
            int count = 1;
            for (int i = 1; i < target.size(); ++i) {
                if (target[i] != target[i - 1]) {
                    temp += to_string(count) + target[i - 1];
                    count = 1;
                    if (i == target.size() - 1) {
                        temp += to_string(count) + target[i];
                    }
                } else {
                    ++count;
                    if (i == target.size() - 1) {
                        temp += to_string(count) + target[i];
                    }
                }
            }
            target = temp;
        }
        return target;
    }
};



