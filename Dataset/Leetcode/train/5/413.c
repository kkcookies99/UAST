 char * XXX(char * s){
    int len = strlen(s);
    int maxlen = 0;    /* 最大长度 */
    int position = 0;  /* 找到回文子串的起始位置 */
    int i = 0;
    int j = 0;
    int **result;      /* 保存动态规划计算的数组 */
    char *result_str;  /* 保存最长回文子串 */

    if (len == 1) {
        return s;
    }

    result = (int **)malloc(len * sizeof(int *));
    for (i = 0; i < len; i ++) {
            result[i] = (int *)malloc(len * sizeof(int));
    }

    for (i = 0; i < len; i++) {
        for (j = 0; j < len; j++) {
            if (s[len - i - 1] == s[j]) {
                if (i != 0 && j !=0 ) {
                    result[i][j] = result[i - 1][j - 1] + 1;
                } else {
                    result[i][j] = 1;
                }
            } else {
                result[i][j] = 0;
            }

            if (maxlen < result[i][j]) {
                if (len - i - 1 == j + 1 - result[i][j])  { /* 通过下标检查下是回文 */
                    maxlen = result[i][j];
                    position = j + 1 - maxlen;
                }
            }
        }
    }

    result_str = (char *)malloc(sizeof(char) * (maxlen + 1));
    strncpy(result_str, &s[position], maxlen);
    result_str[maxlen] = '\0';

    for (i = 0; i < len; i ++) {
            free(result[i]);
    } 
    free(result);

    return result_str;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


