 int XXX(char * haystack, char * needle){
    int l1 = 0, l2 = 0;

    while(haystack[l1] != '\0'){//haystack字符的位数
        ++l1;
    }
    while(needle[l2] != '\0'){//haystack字符的位数
        ++l2;
    }
    if(l2 == 0)return 0;//如果子串是空字符返回0

    int k = 0, l = 0;
    int *next = (int*)malloc(l1 * sizeof(int));
    while(k < l1-l2+1){//建立next数组,即与子串第一个数值一样的数
        if(haystack[k] == needle[0]){
            next[l++] = k;
        }
        ++k;
    }

    int q = 0;
    while(q < l){
        int p = q;
        int m = next[q];
        for(int i = 0; i < l2; ++i){//从next开始,逐个字符比较
            if(haystack[m++] != needle[i]){
                ++q;
                break;
            }//if
        }//for
        if(p == q){
            printf("%d", next[q]);
            return next[q];
            break;
        }
    }
    return -1;
}

