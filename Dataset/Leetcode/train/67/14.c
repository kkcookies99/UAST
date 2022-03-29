 char * XXX(char * a, char * b){
    int len1 = strlen(a);
    int len2 = strlen(b);
    char nums[len1+len2];
    // char *str = (char *)malloc(sizeof(char)*(len1>len2?len1:len2)+1);//为啥这个会堆栈溢出
    char *str = (char *)malloc(sizeof(char)*(len1+len2+1));
    char flag = '0';   //判断是否进位

    if(*a=='0' && *b!='0')
    {
        for(int i=0; i<len2; i++)
            *(str+i) = *(b+i);
        *(str+len2) = '\0';
    }
    if(*a!='0' && *b=='0')
    {
        for(int i=0; i<len1; i++)
            *(str+i) = *(a+i);        
        *(str+len1) = '\0';
    }
    if(len1 < len2)
    {
        //将长度补齐为相等
        int temp = len2-len1;
        char tempstr[len2+1];

        for(int i=0; i<len2; i++)
        {
            if(i < temp)
                tempstr[i] = '0';
            if(i >= temp)
                tempstr[i] = *(a+i-temp);
        }
        tempstr[len2] = '\0';

        a = tempstr;
        len1 = len2;
    }
    if(len1 > len2)
    {
        //将长度补齐为相等
        int temp = len1-len2;
        char tempstr[len1+1];

        for(int i=0; i<len1; i++)
        {
            if(i < temp)
                tempstr[i] = '0';
            if(i >= temp)
                tempstr[i] = *(b+i-temp);
        }
        tempstr[len1] = '\0';
        
        b = tempstr;
        len2 = len1;
    }
    
    if(len1 == len2)
    {
        for(int i=len1-1; i>=0; i--)
        {
            *(nums+i+1) = flag ^ (*(a+i) ^ *(b+i));
            if((*(a+i)=='1' && *(b+i)=='1') || (flag == '1' && *(nums+i+1)=='0'))
                flag = '1';
            else
                flag = '0';
        }

        if(flag=='1')
        {
            nums[0] = '1';
            for(int i=len1; i>=0; i--)
            {
                *(str+i) = nums[i];
                if(i==len1)
                    *(str+i+1) = '\0';            
            }
        }
        else
        {
            nums[0] = '0';
            for(int i=len1; i>0; i--)
            {
                *(str+i-1) = nums[i];
                if(i==len1)
                    *(str+i) = '\0';
            }
        }
    }

    return str;
}

