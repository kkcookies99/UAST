 public boolean XXX(String s) {
    s = s.toLowerCase();
    char[] chs = s.toCharArray();
    int i = 0,j = chs.length - 1;
    while(i < chs.length && j >= 0 ){
        while(i < j && !isRightChar(chs[i]) ){
            i++;
        }
        while(j > i && !isRightChar(chs[j])){
            j--;
        }
        if(i >= j)
            return true;
        if(chs[i] == chs[j]){
            i++;
            j--;
            continue;
        }
        else 
            return false;           
    }         
    return true;
}
public boolean isRightChar(char ch) {
    if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z')){
        return true;
    }else 
        return false;
}

