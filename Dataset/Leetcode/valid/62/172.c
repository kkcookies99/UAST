 int XXX(int m, int n){
    int **dp_paths = (int**)calloc(m,sizeof(int*));
    for(int i = 0 ;i < m; i++){
        dp_paths[i] = (int*)calloc(n,sizeof(int));
        dp_paths[i][0] = 1;
    }
    for(int i = 0 ; i < n; i++){
        dp_paths[0][i] = 1;
    }
    for(int i = 1 ;i < m; i++)
        for(int j = 1; j < n; j++){
            dp_paths[i][j] = dp_paths[i-1][j] + dp_paths[i][j-1];
        }
    return dp_paths[m-1][n-1];
}

