public int XXX(int x) {
        for (int i = 0; i<=Integer.MAX_VALUE; i++){
            int sum=i*i;
            if(sum==x) return i;
            if(sum>x) return i-1;
        }
        return -1;
    }

