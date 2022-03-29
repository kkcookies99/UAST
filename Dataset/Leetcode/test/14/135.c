 char * XXX(char ** strs, int strsSize){
    char *result=NULL;
    int i,j;
    int flag=0,flag_stop=0;
    char c;
    if(!strsSize)//判断数组为空的情况，不然访问越界
        return "";
    for(j=0;strs[0][j]!='\0';j++)
    {
        c=strs[0][j];
        for(i=0;i<strsSize;++i)
        {
            if(c!=strs[i][j])
            {
                flag=1;
                flag_stop=1;//遍历同组相同位置元素发现不相同则终止标志位置1，停止内外层循环
                break;
            }
        }
        if(i==strsSize)//完成内层循环说明有相同前缀，标志位置1
            flag=1;
        if(flag_stop)
            break;
    }
    if(flag)
    {
        result=(char*)malloc(sizeof(char)*(j+1));
        for(i=0;i<j;++i)
        {
            result[i]=strs[0][i];
        }
        result[i]='\0';
    return result;
    }
    else
        return "";
}

