 class Solution {
    public boolean XXX(String s) {
        int length = s.length();
        if(length%2 == 1){
            return false;
        }
        char[] storage = new char[length];
        int current = 0;
        char c;
        char compare;
        for (int i = 0; i <length ; i++) {
            c = s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                storage[current++] = c;
            }else{
                if(current == 0){
                    return false;
                }
                compare = storage[current-1];
                if(c-compare==1||c-compare==2){
                    current--;
                }else{
                    return false;
                }
            }
        }
        return current==0;
    }
}

