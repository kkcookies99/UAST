 int XXX(char * s){
    char *p;
    int ans = 0;

    if (s == NULL) { return 0; }

    for (p = s; *p != '\0'; p++) {
        switch (*p) {
            case 'I':
                if (*(p + 1) == 'V') { ans += 4; p++; }
                else if (*(p + 1) == 'X') { ans += 9; p++; }
                else { ans += 1; }
                break; 
            case 'V':
                ans += 5;
                break;
            case 'X':
                if (*(p + 1) == 'L') { ans += 40; p++; }
                else if (*(p + 1) == 'C') { ans += 90; p++; }
                else { ans += 10; }
                break;
            case 'L':
                ans += 50;
                break;
            case 'C':
                if (*(p + 1) == 'D') { ans += 400; p++; }
                else if (*(p + 1) == 'M') { ans += 900; p++; }
                else { ans += 100; }
                break;
            case 'D':
                ans += 500;
                break;
            case 'M':
                ans += 1000;
                break;
            default:
                return 0;
        }
    }

    return ans;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


