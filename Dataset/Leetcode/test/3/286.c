 #define MAX_CHAR_NUM 2000

bool IsRightStr(char* s, int left, int right)
{
    if (s == NULL || left > right) {
        return false;
    }
    int data[MAX_CHAR_NUM] = {0};
    for (int i = left; i <= right; i++) {
        int idx = (s[i] - 'a' + MAX_CHAR_NUM) % MAX_CHAR_NUM;
        if (data[idx] > 0) {
            return false;
        }
        data[idx]++;
    }
    return true;
}


int XXX(char * s)
{
    if (s == NULL) {
        return 0;
    }
    int left = 0;
    int right = 0;
    char* ptr = s;
    int curlen = 0;
    
    while (s[right] != '\0' && s[left] != '\0') {
        int len = right - left + 1;
        if (IsRightStr(s, left, right)) {
            right++;
            if (len > curlen) {
                curlen = len;
            }
            continue;
        }
        left++;
    }
    return curlen;
}

