 public int XXX(String s) {
    long num = 0;
    int x =s.length();
    int n = -1;
    int sym  = 1;
    while (n+2 <= x && s.charAt(n + 1) == ' '){
        n++;
    }
    if (n+2 <= x && s.charAt(n+1) == '-') {
        sym = -1;
        n++;
    }else if (n+2 <= x && s.charAt(n+1) == '+') {
        n++;
    }
    while (n+2 <= x && s.charAt(n+1) >= '0' && s.charAt(n+1) <= '9'){
        num = num*10 + s.charAt(n+1)-48;
        if(num >Integer.MAX_VALUE){
            break;
        }
        n++;

    }
    num  = sym*num;
    if(num == (int)num ){
    }else if(num > 0){
        num =Integer.MAX_VALUE;
    }else{
        num = Integer.MIN_VALUE;
    }
    return (int) num;
}
