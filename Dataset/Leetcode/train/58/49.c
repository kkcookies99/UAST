 int XXX(char * s){
    int wordLength = 0;
    int index = 0;

    //先定位到字符串尾部
    while(s[index]){
        index++;
    }
    index--;

    //从后往前读
    //过滤空格
    while(index>=0 && s[index]==' '){
        index--;
    }

    //读取单词
    while(index>=0 && s[index]!=' '){
        index--;
        wordLength++;
    }

    return wordLength;
}