 char * XXX(char * s){
  int dp[1001][1001];
  int len = strlen(s);
  int maxlen = 1;
  int start = 0;
  int end = 0;
  for(int i = 0; i < len; i++){
      dp[i][i] = 1;
  }
  for(int i = 0; i < len; i++){
      for(int j = i; j >= 0; j--){ 

          if((s[i] == s[j]) && (i - j < 2)){
              dp[i][j] = 1;

          }
          else if((s[i] == s[j]) && (dp[i - 1][j + 1] == 1)){
                  dp[i][j] = 1;
              }
          
          if((dp[i][j] == 1) && (i - j + 1 > maxlen)){
              maxlen = i - j + 1;
              start = j ;
              end = i;

          }
     }
  }   
  //static char *ans ;
  char * ans =(char *) malloc(sizeof(char) * (maxlen + 1 ));
  strncpy(ans, s + start, maxlen);
  ans[maxlen] = '\0';
  //free(ans);
  
  return ans;  

}

