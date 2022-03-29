 char * XXX(char ** strs, int strsSize){
    int i;
    int count = 0;
    if (strsSize == 0)  //判断是否有数据
        return "\0";

    while(*(strs[0]+count)){
        for(i = 1; i < strsSize; i++){
            if(*(strs[0]+count) != *(strs[i]+count)){
                *(strs[0]+count) = '\0';
                return strs[0]; 
            }
        }
        count++;
    }
    return strs[0];
}

