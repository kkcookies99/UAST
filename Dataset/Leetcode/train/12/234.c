 char * XXX(int num){
    int numArr[13]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    char *RomArr[13]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    int index=0;
    char *result = (char *)malloc(100*sizeof(char));
    *result = '\0';

    while ((index<13) && num>0)
    {
        if (num>=numArr[index])
        {
            strcat(result,RomArr[index]);
            num-=numArr[index];
        }
        //判断是否进行下一个级别的转换
        if (num<numArr[index])
        {
            index++;
        }
        
    }
    return result; 
}

