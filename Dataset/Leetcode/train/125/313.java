 class Solution {
    public boolean XXX(String s) {
        //数字 0 -9 ----->48 - 57   A - Z 65 - 90  a - z 97 - 122 空格 32
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for(int i = 0 ; i < s.length() ; i++){
            int k = isOK(s.charAt(i));
            if(k != -1){
                queue.add((char)k);
            }
        }
        int size = queue.size();
        while(!queue.isEmpty()){
            if((size%2 != 0 && queue.size() == 1))break ;
            if(queue.removeFirst() != queue.removeLast()){
                return false ;
            }
        }
        return true ;
    }
    public int isOK(char x){
        int k = x+0;
        if(k >= 48 && k <= 57)return k;
        if(k >= 97 && k <= 122)return k;
        if(k >= 65 && k <= 90)return k + 32; 
        return -1;
    }
}

