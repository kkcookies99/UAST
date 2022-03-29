 class Solution {
    public boolean XXX(String s) {
        if("".equals(s)) return true;
        char[] c = s.toCharArray();
        int i = 0,j=c.length-1;
        while(i<j){
            while((i<j)&&(!(isDigit(c[i])||isLower(c[i])||isUpper(c[i])))) i++;
            while((i<j)&&(!(isDigit(c[j])||isLower(c[j])||isUpper(c[j])))) j--;
            if(i>=j) return true;
            char x = c[i];
            char y = c[j];
            if(isDigit(x)){
                if(x!=y) return false;
            }
            else if(x!=y&&(Math.abs((int)x-(int)y)!=32)) return false;
            i++;
            j--;
        }
        return true;
    }

    public boolean isDigit(char c){
        return c>='0'&&c<='9';
    }

    public boolean isUpper(char c){
        return c>='A'&&c<='Z';
    }

    public boolean isLower(char c){
        return c>='a'&&c<='z';
    }
}

