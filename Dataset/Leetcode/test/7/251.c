int XXX(int x) {
        long rem = 0;
        long num = 0;
        while(x){
            rem = x%10;
            x = x/10;
            num = num*10+rem;
        }
        if(num>2147483647||num<-2147483648){
            return 0;
        }
        return num;
    }

