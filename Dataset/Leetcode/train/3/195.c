 int XXX(char * s)//版本三
{
    if(*s=='\0')
    {
        return 0;
    }
    int sz=1,count=1;
    char *arr=(char* )malloc(sizeof(char)*strlen(s));
    *arr=*s++;

    while(*s)
    {
        int judge=-1;//判断是不是相同
        for(int j =0;j<count;j++)//比不相同位数次
        {
            if(arr[j]==*s)
            {
                judge=j;
                break;
            }
        }

        if(judge==-1)//不相同就插入
        {
            arr[count]=*s++;
            count++;
            

        }
        else//相同
        {

            count-=judge;//往前娜的位数
                for(int i=0;i<count-1;i++)//挪动数据
                {
                     arr[i]=arr[++judge];
                }
                arr[count-1]=*s++;
        }
        sz=sz>count?sz:count;//更新位数

    }
    return sz;
}

