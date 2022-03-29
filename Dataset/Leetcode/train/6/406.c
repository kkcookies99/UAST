 char * XXX(char * s, int numRows){
    int len = strlen(s);
    if(len == 1 || len == 0 || numRows == 1)
    return s;
    int i = 0;
    int flag = 1;
    int tmp = 0;
    int prev1 = 0,prev2 = 0;
    char arr[numRows][len + 1];
    int count[numRows];
    for(i = 0 ; i < numRows; i++)
    {
        count[i] = 0;
    }
    while(*s)
    {
        if(flag == 1)
        {
            if(*s == '\0')
            {
                break;
            }
            arr[0][count[0]] = *s;
            s++;
            count[0]++;
            for(i = 1; i < numRows - 1; i++)
            {
                if(*s == '\0')
                {
                    break;
                }
                arr[i][count[i]] = *s;
                s++;
                count[i]++;
            }

            if(*s == '\0')
            {
                break; 
            }
            arr[numRows - 1][count[numRows - 1]] = *s;
            s++;
            count[numRows - 1]++;
            flag = -flag;
        }
        else
        {
            for(i = numRows - 2; i > 0; i--)
            {
                if(*s == '\0')
                {
                    break;
                }
                arr[i][count[i]] = *s;
                s++;
                count[i]++;
            }
            flag = -flag;
        }
    }
    arr[0][count[0]] = '\0';
    for(i = 1 ; i <numRows - 1; i++)
    {
        arr[i][count[i]] = '\0';
    }   
    arr[numRows - 1][count[numRows - 1]] = '\0';

    char* pa = (char*)malloc(sizeof(char)* 17000);
    int Acount = 0;
    int count1 = 0;
    while(arr[0][count1] != '\0')
    {
        pa[Acount] = arr[0][count1];
        Acount++;
        count1++;
    }
    
    
    for(i = 1; i < numRows - 1; i++)
    {
        count1 = 0;
        while(arr[i][count1] != '\0')
        {
            pa[Acount] = arr[i][count1];
            Acount++;
            count1++;
        }
    }
    
    count1 = 0;
    while(arr[numRows - 1][count1] != '\0')
    {
        pa[Acount] = arr[numRows - 1][count1];
        Acount++;
        count1++;
    }
    pa[Acount] = '\0';
    return pa;
}

