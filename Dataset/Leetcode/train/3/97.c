 int XXX(char * s){
    int start = 0;
    int end = 0;
    int length = 0;
    int maxLength = 0;
    int tong[128] = {0};

    tong[s[start]] = 1;
    while (s[end] != '\0') {
        length = end -start + 1;
        maxLength = maxLength > length ? maxLength : length;
        end++;
        while (tong[s[end]] == 1) {
            tong[s[start]] = 0;
            start++;
        }
        tong[s[end]] = 1;

    }
    return maxLength;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

