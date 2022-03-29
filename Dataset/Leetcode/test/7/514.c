 int XXX(int x){
    int minNum = -2147483648, maxNum = 2147483647;
    long returnNum = 0, tempNum = x;
    while(tempNum)
    {
        if((returnNum*10+tempNum%10) > maxNum || (returnNum*10+tempNum%10)<minNum)
            return 0;
        returnNum = returnNum*10+tempNum%10;
        tempNum /= 10; 
    }
    return (returnNum >= minNum && returnNum <= maxNum) ? returnNum : 0;
}

