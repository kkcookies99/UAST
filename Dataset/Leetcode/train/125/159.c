 bool XXX(char * s){
    int len = strlen(s);
    int left = 0;
    int right = len - 1;
    while (left < right) {
        while (!isalpha(s[left]) && !isdigit(s[left]) && left < right) {
            left++;
        }
        while (!isalpha(s[right]) && !isdigit(s[right]) && left < right) {
            right--;
        }
        if (tolower(s[left]) != tolower(s[right])) {
            return false;
        }
        right--;
        left++;
    }
    return true;
}

