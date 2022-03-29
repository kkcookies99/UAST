 int* XXX(int* digits, int digitsSize, int* returnSize){
    int i=0;
    int* num=NULL;
    int flag=0;
    for(i=0;i<digitsSize;i++)
    {
        if(digits[i]!=9)
        {
            num=(int*)malloc(sizeof(int)*digitsSize);
            flag=1;
        }
    }
    if(!flag)
    {
        num=(int*)malloc(sizeof(int)*(digitsSize+1));
        *returnSize=digitsSize+1;
        num[0]=1;
        for(i=1;i<*returnSize;i++)
        {
            num[i]=0;
        }
    }
    else
    {
        num[digitsSize-1]=(digits[digitsSize-1]+1);
        int over=0;
        if(num[digitsSize-1]>9)
        {
            over=num[digitsSize-1]/10;
            num[digitsSize-1]%=10;
            
        }
        else
        {
            over=0;
        }
        for(i=digitsSize-2;i>=0;i--)
        {
            num[i]=digits[i]+over;
            if(num[i]>9)
            {
                over=num[i]/10;
                num[i]%=10;
                
            }
            else
            {
                over=0;
            }
        }
        
        *returnSize=digitsSize;
    }
    return num;
}

