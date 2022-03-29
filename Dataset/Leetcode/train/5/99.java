  public String XXX(String s) {
        int length = s.length();
        if(length<2){
            return s;
        }
        int start=0;
        int max =1;
        boolean[][] dp = new boolean[length][length];
        for(int i=0;i<length;i++){
            dp[i][i] = true;
        }
        for(int L=1;L<length;L++){
            for(int R=L-1;R>=0;R--){
                if(L-R+1>2){
                    dp[R][L] = dp[R+1][L-1]&&s.charAt(R)==s.charAt(L);
                }else{
                    dp[R][L] = s.charAt(R)==s.charAt(L);
                }
                
                if(dp[R][L]&&L-R+1>max){
                    start = R;
                    max = L-R+1;
                }

            }
        } 
        return  s.substring(start,start+max);

    }

