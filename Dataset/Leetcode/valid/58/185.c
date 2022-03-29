 int XXX(char * s){
    if(*s=='\0') return 0;
    int ans = 0;
    char *end = s + strlen(s) -1;

    while(*end==' '){
        end--;
    }
    while(s<=end && *end!=' '){
      ans++;
      end--;
    }
    return ans;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


