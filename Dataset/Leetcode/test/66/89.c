 int* XXX(int* digits, int digitsSize, int* returnSize){
    for(int i=digitsSize-1;i>=0;--i)
    {
        digits[i] = (digits[i]+1)%10;
        if(digits[i]!=0)    break;
    }
    *returnSize = digitsSize;
    if(digits[0]==0)
    {
        int *result = (int*)malloc(sizeof(int)*(digitsSize+1));
        result[0] = 1;
        for(int k=1;k<digitsSize+1;++k)
            result[k] = 0;
        *returnSize = digitsSize+1;
        return result;
    }
    else
        return digits;
}

