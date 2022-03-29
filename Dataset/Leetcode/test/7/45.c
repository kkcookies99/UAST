 int XXX(int x) {
        int y = 0;
        while(x/10 != 0 ){
            y = y*10+x%10;
            x = x/10;
            if(y>INT_MAX/10||y<INT_MIN/10)  return 0;
        }
        if((y==INT_MAX/10&&x>INT_MAX%10)||(y==INT_MIN/10&&x<INT_MIN%10)) return 0;
        y = y*10+x%10;
        return y;
    }
};

