int XXX(char * str){
    int index=0,flag=0;
    while(str[index]==' ')
        index++;
    if(str[index]=='-'){
        flag=1;
        index++;
    }else if(str[index]=='+'){
        index++;
    }
    if(str[index]<'0'||str[index]>'9')
        return 0;
    int pop=0,ans=0;
    for(;str[index]>='0'&&str[index]<='9';index++){
        pop=str[index]-'0';
        if(ans>0x7FFFFFFF/10||(ans==0x7FFFFFFF/10&&((flag==0&&pop>=7)||(flag==1&&pop>=8))))
            return flag?0x80000000:0x7FFFFFFF;
        ans=ans*10+pop;
    }
    return flag?-ans:ans;
}

