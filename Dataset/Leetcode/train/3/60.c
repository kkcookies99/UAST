 int XXX(char * s){
    int start;
    int end;
    int len;
    int maxLen = 0;
    int i;

    //如果字符串为空，或者只有1个字符，则返回0或者1
    len = strlen(s);
    if(len == 0 || len == 1)
    {
        return len;
    }
    
    start = 0;
    end = 0;
    len = 1;
    maxLen = 1;
    
    //到这里，肯定长度是大于1的
    while(s[end+1]!=0)//每次取下一个
    {
        //哪下一个，到前面的最长字符串（前面的肯定没重复）去判断是否有重复
        for(i = start; i <=end; i++)
        {   
            //找到，则终止（因为在探索下一个之前，前面串没重复，则找到一个，就不需要再找了）
            if(s[end+1] == s[i])
            {
                break;               
            }
        }
        //在原来串没找到重复，则end扩大，窗口扩大;否则，左边边界移动到第一个重复字符之后
        if(i <= end)
        {
            start = i+1;
        }
        end++;//窗口扩大
        len = end - start + 1;//计算当前长度
      
        if(maxLen < len) //保存最大长度
        {
            maxLen = len;
        }
    }  
    return maxLen;               
}



