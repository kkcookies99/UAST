 bool XXX(char * s){
if(!s) return 1;
for(int i=0,j=strlen(s)-1;i<j;i++,j--){
    if(s[i]>='a' && s[i]<='z' || s[i]>='0' && s[i]<='9');
    else if(s[i]>='A' && s[i]<='Z') s[i]=tolower(s[i]);
    else {j++;continue;}
    if(s[j]>='a' && s[j]<='z' || s[j]>='0' && s[j]<='9');
    else if(s[j]>='A' && s[j]<='Z') s[j]=tolower(s[j]);
    else {i--;continue;}
    if(s[i]!=s[j]) return 0;
}
return 1;
}

