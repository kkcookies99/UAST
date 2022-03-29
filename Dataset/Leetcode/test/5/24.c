 char * XXX(char * s){
    int left = 0;
    int right = 0;    
    int maxLength = 0;      //回文子串最大长度
    int startIndex = 0;     //最长回文子串开始位置
    int index = 0;

    while(s[index]){
        right=index;
        left=index-1;
    
        //从当前字符开始往右读取连续重复字符(连续重复字符必定能构成回文子串，也必定是回文子串的一部分)
        //如"abcccd" 中从索引1开始的连续重复字符是"b"，从索引2开始连续重复字符是'ccc'
        while(s[right]==s[index]){
            right++;
        }

        //定位下一个子串的中心
        index = right;
        
        //以连续重复字符为中心，往左右延展,判断当前子串是否为回文子串
        while(left >= 0 && s[right] && s[left]==s[right]){
            left--;
            right++;
        }
        
        //记录回文子串的最大长度和起始索引
        if(right-left-1>maxLength){
            startIndex = left+1;
            maxLength = right-left-1;
        }
     
    }
    
    //返回回文子串
    char* returnStr = (char*)malloc(maxLength+1);
    returnStr[maxLength]='\0';
    for(int i=0;i<maxLength;i++){
        returnStr[i]=s[startIndex+i];
    }
    return returnStr;
    
}

