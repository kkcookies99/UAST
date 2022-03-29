 char * XXX(int num){
    int nums[13]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    char *str[13]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    char *result=(char *)malloc(sizeof(char)*20);
    *result = NULL;
    int i;
    while(num){
        for(i=0;i<13;i++){
            if(num>=nums[i]){
                result = strcat(result, str[i]);
                num -= nums[i];
                break;
            }
        }
    }
    return result;
}

