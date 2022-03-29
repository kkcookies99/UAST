char * XXX(int n){
    int i, j, k;
    int cnt, echos = 1;
    char ch;
    char **nums = (char**)calloc(n, sizeof(char*));
    nums[0] = (char*)calloc(echos+1,sizeof(char));
    nums[0][0] = '1';
    for(i = 1;i < n;++i)
    {
        echos *= 2;k = 0;
        nums[i] = (char*)calloc(echos+1,sizeof(char));
        ch = nums[i-1][0];
        for(j = 0, cnt = 0;ch != '\0';++j)
        {
            if(ch != nums[i-1][j])
            {
                nums[i][k++] = cnt + '0';
                nums[i][k++] = ch;
                ch = nums[i-1][j];
                cnt = 1;
            }
            else ++cnt;
        }
        free(nums[i-1]);
    }
    return nums[n-1];
}

