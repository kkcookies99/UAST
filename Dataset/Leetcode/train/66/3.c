 int* XXX(int* digits, int digitsSize, int* returnSize){
    int *retnums = NULL;

    if(digits[0] == 0)
    {
        *returnSize = 1;
        retnums = (int *)malloc(sizeof(int)*(*returnSize));
        *retnums = 1;
    }
    else if(digits[0]==9 && digitsSize==1)
    {
        *returnSize = digitsSize+1;
        retnums = (int *)malloc(sizeof(int)*(*returnSize));
        *(retnums) = 1;
        *(retnums+1) = 0;
    }
    else if(digits[digitsSize-1] == 9 && digits[digitsSize-2] != 9)
    {
        *returnSize = digitsSize;
        retnums = (int *)malloc(sizeof(int)*(*returnSize));
        for(int i=0; i<(*returnSize); i++)
            *(retnums+i) = *(digits+i);
        *(retnums+(*returnSize)-2) += 1;
        *(retnums+(*returnSize)-1) = 0;
    }
    else if(digits[digitsSize-1] == 9 && digits[digitsSize-2] == 9)
    {
        int flag = 1;
        for(int i=digitsSize-1; i>=0; i--)
        {
            if(flag==1 && digits[i] == 9)
                digits[i] = 0;
            else if(flag==1 && digits[i] != 9)
            {
                digits[i] += 1;
                flag = 0;
            }
        }

        if(flag == 1)
        {
            *returnSize = digitsSize+1;
            retnums = (int *)malloc(sizeof(int)*(*returnSize));
            *(retnums) = 1;
            for(int i=0; i<(*returnSize-1); i++)
                *(retnums+i+1) = *(digits+i);
        }
        else
        {
            *returnSize = digitsSize;
            retnums = (int *)malloc(sizeof(int)*(*returnSize));
            for(int i=0; i<(*returnSize); i++)
                *(retnums+i) = *(digits+i);
        }
    }
    else
    {
        *returnSize = digitsSize;
        retnums = (int *)malloc(sizeof(int)*(*returnSize));
        for(int i=0; i<(*returnSize); i++)
            *(retnums+i) = *(digits+i);
        *(retnums+(*returnSize)-1) += 1;
    }

    return retnums;
}

