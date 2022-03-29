 class Solution {
public:
    string XXX(vector<string>& strs) {
        char maxArr[201] = {0};
        int first = 0;
        for (auto ele : strs) {
            if (!first) {
                strncpy(maxArr, ele.c_str(), sizeof(maxArr)-1);
                first = 1;
                continue;
            }
            for (int i=0; i<strlen(maxArr); i++) {
                if (i < ele.length() && maxArr[i] == ele[i]) {
                    continue;
                }
                maxArr[i] = 0;
            }
        }
        string result = maxArr;
        return result;
    }
};

