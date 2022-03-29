 char * XXX(char * s, int numRows){
    int len=strlen(s);
    if(numRows<=1)//如果行数为0或1，那么不需要做任何转换直接输出
        return s;
    char *str=(char *)malloc(sizeof(char)*(len+1));//创建新数组用来存放最终输出的字符串
    int j=0;
    int t=numRows+numRows-2;//第0行和最后一行步长
    for(int i=0;i<numRows;i++){
        int c=i;
        if(i==0||i==numRows-1){//第0行和最后一行情况
            while(c<len){
                str[j]=s[c];
                c=c+t;
                j++;
            }
        }
        else{//其余行
            int b=t-2*i;//其余行步长初始值
            while(c<len){
                str[j]=s[c];
                c=c+b;
                b=t-b;
                j++;
            }
        }
    }
    str[j]='\0';
    return str;
}

