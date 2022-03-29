 int XXX(char * s){
        int last_index[128]; // 记录字符上一次出现的下标
        int max_value = 0;
        int cur_len = 0;
        int i;

        for(i=0; i<128; i++) {
                last_index[i] = -1;
        }

        for(i=0; s[i] != '\0'; i++) {
                cur_len = (cur_len+1) < (i - last_index[s[i]]) ? cur_len+1 : (i - last_index[s[i]]);
                last_index[s[i]] = i;
                if (max_value < cur_len) 
                        max_value = cur_len;
        }
        return max_value;
}

