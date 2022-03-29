 class Solution {
public:

    int GetHuiWenLenEven(const char *str, int index) {
        int i = 1;
        for (; (index >= i) && str[index - i] == str[index + i - 1]; i++);
        return 2 * (i - 1);
    }

    int GetHuiWenLenOdd(const char *str, int index) {
        int i = 1;
        for (; (index >= i) && str[index - i] == str[index + i]; i++);
        return 1 + 2 * (i - 1);
    }

    string XXX(string s) {
        const char *str = s.c_str();
        int size = s.length();
        int maxSize = 0;
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            int sizeO = GetHuiWenLenOdd(str, i);
            if (maxSize < sizeO) {
                maxSize = sizeO;
                maxIndex = i;
            }
            int sizeE = GetHuiWenLenEven(str, i);
            if (maxSize < sizeE) {
                maxSize = sizeE;
                maxIndex = i;
            }
        }
        return s.substr(maxIndex - (maxSize >> 1), maxSize);
    }
};

