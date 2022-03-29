 int XXX(char * s){
    int i = 0;
    int count = 0, max = 0;
    int start = 0;
    int* index = (int*)malloc(128*sizeof(int)); 
    //int index[128] == 0;
    for(i; s[i] != '\0'; i++){
        if(index[s[i]] > start){
            count = i - start;
            max = count > max ? count : max;
            start = index[s[i]];  //不断刷新重复字符的位置
        }
        index[s[i]] = i+1;
    }
    count = i - start;
    max = count > max ? count : max;
    return max;
}

