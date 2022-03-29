 char * XXX(char * a, char * b){
    int lenA,lenB,lenMax,lenMin,i,carry=0,temp;
    lenA=strlen(a);
    lenB=strlen(b);
    char *maxS,*minS,*c;
    if(lenA>lenB){
        lenMax=lenA;
        lenMin=lenB;
        maxS=a;
        minS=b;
    }else{
        lenMax=lenB;
        lenMin=lenA;
        maxS=b;
        minS=a;
    }
    c=(char *)malloc(sizeof(char)*(lenMax+1));
	strcpy(c,minS);
    for(i=lenMin;i>=0;i--){
        c[i+lenMax-lenMin]=c[i];
    }
    for(i=0;i<lenMax-lenMin;i++){
        c[i]='0';
    }
    for(i=lenMax-1;i>=0;i--){
        temp=(maxS[i]-'0'+c[i]-'0'+carry)%2;
        carry=(maxS[i]-'0'+c[i]-'0'+carry)/2;
        c[i]=temp+'0';
    }
    lenMax++;
    if(carry){
        c=(char *)realloc(c,sizeof(char)*(++lenMax));
        for(i=lenMax-3;i>=0;i--){
             c[i+1]=c[i];
        }
    c[0]='1';
    }
	c[lenMax-1]='\0';
    return c;
}

