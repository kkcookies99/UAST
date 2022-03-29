 int XXX(char * s){
    size_t length = strlen(s);
    //处理特殊情况
    if(length==0) return 0;

    //初始化
    int result = 0;
    bool is_reverse_empty=true;
    
    //倒数
    for(int i=length-1;i>=0;i--){
        //倒数如果是空格
        if(is_reverse_empty){
            //如果不是空格，bool置false，同时计数+1
            if(s[i]!=' ') {
                is_reverse_empty=false;
                result++;
            }
        }
        //已经不是空格了，正常计数直到遇到空格
        else{
            if(s[i]!= ' ') result++;
            else break;
        }
    }
    return result;
}

