int XXX(int x) {
    int a=0;
    int i,j;
    long long int test=0;//长整型64位
    int num = x;
    long int nums[20];   //长
    if(x >= 2147483647 || x <= -2147483648) test = 0;
    else{
        if(num<0) x = -x;
        while(x>0)////计算整数有几位
        {
            nums[a] = x%10;
            x = x/10;
            a++;
        }
        for(i=0;i<a;i++)
        {
            for(j=a;j>i+1;j--)
            {
                nums[i] *= 10;
            }
            test += nums[i];
        }
        if(test > 2147483647 || test < -2147483648) test = 0;
        if(num<0) test = -test;
    }
    return test;
}