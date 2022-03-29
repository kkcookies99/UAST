 public int XXX(String s) {
int n=s.length();
int m=0;
for(int i=0;i<n-1;i++){
    switch (s.charAt(i)){
        case'I':if(s.charAt(i+1)!='X'&&s.charAt(i+1)!='V'){m=m+1;}
            else {m=m-1;} break;
        case'X':if(s.charAt(i+1)!='L'&&s.charAt(i+1)!='C'){m=m+10;}
        else {m=m-10;}break;
        case'V':m=m+5;break;
        case'L':m=m+50;break;
        case'C':if(s.charAt(i+1)!='D'&&s.charAt(i+1)!='M'){m=m+100;}
             else {m=m-100;}break;
        case'D':m=m+500;break;
        case'M':m=m+1000;break;
    }
}
switch (s.charAt(n-1)){
        case'I':m=m+1; break;
        case'X':m=m+10;break;
        case'V':m=m+5;break;
        case'L':m=m+50;break;
        case'C':m=m+100;break;
        case'D':m=m+500;break;
        case'M':m=m+1000;break;
}

return m;
}

