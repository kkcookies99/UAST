 char* XXX(char* s) {
    if (s == NULL) {
        return NULL;
    }
    unsigned long len = strlen(s);
    if (len <= 1) {
        return s;
    }
    int max = 1;
    int index = 0;
    for (int a = 1; a < len; a++) {
        int count = 1;
        while (s[a - count] == s[a + count]) {
            count++;
            if (a + count >= len || a - count < 0) {
                break;
            }
        }
        count = 2 * count - 1;
        if (count > max) {
            max = count;
            index = a;
        }
        count = 1;
        while (s[a-count] == s[a + count - 1]) {
            count++;
            if (a-count < 0 || a + count - 1 >= len) {
                break;
            }
        }
        count = 2 * count - 2;
        if (count > max) {
            max = count;
            index = a;
        }
    }
    char *ans = malloc(sizeof(char) * (max+1));
    if (max == 1) {
        ans[0] = s[0];
    }else{
        index = index - max / 2;
        for (int a = 0; a < max; a++) {
            ans[a] = s[index+a];
        }
    }
    
    ans[max] = '\0';
    return ans;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

