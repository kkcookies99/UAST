 int XXX(char * s){
    int occupied[256] = {0};
    int ptr = 0;
    int max_len = 0;
    int str_len = strlen(s);
    int len = 0;

    while(ptr < str_len)
    {
        /*有重复情况*/
        if(0 != occupied[s[ptr]])
        {
            max_len = max_len > len ? max_len : len;
            ptr = occupied[s[ptr]];  
            len = 0;
            memset((char*)occupied, 0, sizeof(occupied));
        }
        else/*无重复情况*/
        {
            occupied[s[ptr]] = ptr + 1;
            ptr++;
            len++;
        }   
    }
    max_len = max_len > len ? max_len : len;
    return max_len;
}

