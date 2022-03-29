 int XXX(char * s){
    int ind[128] = {0};// 索引映射储存上一次出行的位置。
    int ans = 0;
    for(int i = 0,j = 0;s[j];++j){
        i = fmax(ind[s[j]],i);
        ans = fmax(ans,j - i + 1);
        ind[s[j]] = j + 1;
    }
    return ans;
}

