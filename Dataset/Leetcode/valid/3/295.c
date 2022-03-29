 int Mymax(int a, int b)
{
    return a > b ? a : b;
}

int XXX(char * s){
    int slen = strlen(s);
    if (slen == 0) {
        return 0;
    }
    int char256[256];
    for (int i = 0; i < 256; i++) {
        char256[i] = 0;
    }
    int maxlen = 1;
    int right = 0;
    for (int i = 0; i < slen; i++) {
        if (i > 0) { // i的每次移动都吐出前面一个字符
            char256[s[i - 1]]--;
        }
        for (int j = right; j < slen; j++) {
            if (char256[s[j]] == 0) { // 不重复，加1
                char256[s[j]]++;
            } else { // 重复了，记录最大长度，记录右边界，退出左边的字符，退出内层循环
                maxlen = Mymax(maxlen, j - i);
                right = j;
                break;
            }

            if (j == slen - 1) { // 最后退出的时候没有重复，要单独处理，此时可以退出外层循环
                maxlen = Mymax(maxlen, j - i + 1);
                return maxlen;
            }
        }
    }
    return maxlen;
}

