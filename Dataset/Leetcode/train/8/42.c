int XXX(char* str) {
    int symbol = 0; // 符号，表示正负
    long num = 0; // 数值和
    for(int i = 0;str[i] != '\0';i++) {
        char c = str[i];
        if(symbol == 0) {
            if(c >= '0' && c <= '9'){
                symbol = 1;
                num += c - '0';
            }else if(c == '-'){
                symbol = -1;
            }else if(c == '+'){
                symbol = 1;
            }else if(c != ' '){
                break;
            }
        }else{
            if(c >= '0' && c <= '9'){
                if(num == 0 && c == '0')
                    continue;
                num *= 10;
                num += (c - '0');
                if(num > 2147483647)
                    return (symbol > 0?INT_MAX:INT_MIN);
            }else{
                break;
            }
        }
    }
    return num * symbol;
}

