 bool XXX(char * s){
    char *r = s + strlen(s) - 1;

    while (r > s)   //空串会跳过循环直接返回true，满足题意
    {
        //大写转小写
        if (('A' <= *r) && ('Z' >= *r)) *r += 32;
        if (('A' <= *s) && ('Z' >= *s)) *s += 32;
        //判断是否字母或数字字符
        if (((*r < '0') || (*r > '9')) && ((*r < 'a') || (*r > 'z')))
        {
            r--;
            continue;
        }
        if (((*s < '0') || (*s > '9')) && ((*s < 'a') || (*s > 'z')))
        {
            s++;
            continue;
        }
        //不匹配直接返回false，不再继续循环
        if (*r != *s) return false;
        //进行下一轮字符匹配
        s++;
        r--;
    }
    //匹配完成都没有返回false，则是回文串，返回true
    return true;
}

