 class Solution {
public:
    string XXX(int n) {
        string str = "1";
        if (n == 1) {
            return str;
        }
        int count = 1;
        string newStr;
        while (count < n) {
            newStr.clear();
            int i = 0, j = 0;
            for (; j < str.size();) {
                if (str[j] == str[j + 1]) {
                    j++;
                }
                else {
                    newStr.push_back(j - i + 1 + '0');
                    newStr.push_back(str[j]);
                    j++;
                    i = j;
                }
            }
            str = newStr;
            count++;
        }
        return newStr;
    }
};

