 int XXX(char * s){
    int len=strlen(s);
    if(len<=1)
        return len;
    int left=0,right=1,max=0;
    int hash[256]={0};    //记录当前子串字符出现次数
    hash[s[left]]=1;
    while(right<len){
        hash[s[right]]++;
        //如果hash[s[right]]>1,说明左右指针中间存在与右指针相同的字符
        while(hash[s[right]]>1){    
            //移动左指针,直到左右指针中间不存在与右指针相同字符
            hash[s[left]]--;
            left++;
        }
        max=fmax(max,right-left+1);  //记录当前符合条件的最大字串长度
        right++;
    }
    return max;
}

