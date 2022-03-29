 public int XXX(String haystack, String needle) {
        //朴素解法
        int n = haystack.length(),m = needle.length();

        char[] s = haystack.toCharArray(), p = needle.toCharArray();
        
        for(int i=0;i<=n-m;i++) {
            int a = i,b = 0;
            while(b<m && s[a] == p[b]) {
                a++;
                b++;
            }
            if(b==m) return i;
        }
        return -1;
    }

