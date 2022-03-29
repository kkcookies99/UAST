     public int XXX(int m, int n) {
        if(m==1||n==1)return 1;
        if(m==2)return n;
        if(n==2)return m;
        return XXX(m-1,n)+XXX(m,n-1);
    }

