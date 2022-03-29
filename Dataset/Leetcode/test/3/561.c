 int XXX(char * s){
    int res = 0;
    int len = strlen(s);
    /* 存储 ASCII 字符在子串中出现的次数 */
    int freq[256] = {0};  
    /* 定义滑动窗口为 s[l...r] */
    int l = 0, r = -1; 
    while (l < len) {
        /* freq 中不存在该字符，右边界右移，并将该字符出现的次数记录在 freq 中 */
        if (r < len - 1 && freq[s[r + 1]] == 0) {
            freq[s[++r]]++;
        /* 右边界无法拓展，左边界右移，刨除重复元素，并将此时左边界对应的字符出现的次数在 freq 的记录中减一 */
        } else {
            freq[s[l++]]--;
        }
        /* 当前子串的长度和已找到的最长子串的长度取最大值 */
        res = fmax(res, r - l + 1);
    }

    return res;
}

