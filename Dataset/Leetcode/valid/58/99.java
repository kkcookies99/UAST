 public int XXX(String s) {
    int result = 0;
    for (int i = s.length()-1; i >=0; i--) {
        if(s.charAt(i)==' '){
            if(result!=0) break;
            continue;
        }
        result++;
    }
    return result ;  
}

