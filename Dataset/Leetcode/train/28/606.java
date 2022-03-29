     public int XXX(String haystack, String needle) {
        int n = haystack.length(),m = needle.length();
        final int R = 26;
        //安全校验
        if(m == 0){
            return 0;
        }
        if(n==0 || n<m){
            return -1;
        }

        int[][] KMP = new int[26][m];
        //初始化
        KMP[needle.charAt(0)-'a'][0] = 1;
        for (int i = 1,X = 0; i < m; i++) {
            for (int j = 0; j < R ; j++) {
                KMP[j][i] = KMP[j][X];
            }
            KMP[needle.charAt(i)-'a'][i] = i+1;
            X = KMP[needle.charAt(i)-'a'][X];
        }

        //判断
        int i,j;
        for (i=0,j=0 ;i < n && j<m; i++) {
            j = KMP[haystack.charAt(i)-'a'][j];
        }
        if(j == m){
            return i - m;
        }
        return -1;
    }
