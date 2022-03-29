 char * XXX(char * s, int numRows){
    const int len = strlen(s);
    const int maxStep = (numRows > 1) ? 2 * numRows - 2 : 1;

    char *ans = (char *)malloc(sizeof(char) * (len+1));
    int ansSize = 0;

    for (int row = 0; row < numRows; row++) {
        int i = row;
        bool flag = true;
        while (i < len) {
            ans[ansSize++] = s[i];
            int step = maxStep;
            if (0 < row && row < numRows - 1) {
                step = flag ? maxStep - 2*row : 2*row;
                flag = !flag;
            }
            i += step;
        }
    }

    ans[ansSize] = '\0';
    return ans;
}

