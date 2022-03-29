 char * XXX(int num){
    enum LMSZ{I,V,X,L,C,D,M} lmsz;
    char table[4][9][5] ={{"I","II","III","IV","V","VI","VII","VIII","IX"},
                           {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                           {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                        {"M","MM","MMM"}};
    char *rt_chars;                   
    int i,j,k,l=0;
    rt_chars=malloc(sizeof(char)*16);
    memset(rt_chars,0,sizeof(char)*16);
    i=num>=1000?1000:num>=100?100:num>=10?10:1;
    k=num>=1000?3:num>=100?2:num>=10?1:0;
    while(num){
        j=num/i;        
        num%=i;
        i/=10;
        strcpy(rt_chars+l,table[k][j-1]);
        l+=strlen(table[k][j-1]);
        k--;
        while(num<i && num){
            k--;
            i/=10;
        }
    }
    return rt_chars;

}

