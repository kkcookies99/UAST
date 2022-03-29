class Solution {
    public String XXX(int n) {
        return get(n-1,1+"");
    }

    public String get(int n,String cur){
        if(n == 0){
            return cur;
        }
        StringBuilder sb = new StringBuilder(); 
        char c = cur.charAt(0);
        int num = 0;
        for(int i = 0;i < cur.length();i++){
            if(cur.charAt(i) != c){
                sb.append(num);
                sb.append(c);
                c = cur.charAt(i);
                num = 1;
            }else{
                num += 1;
            }
            if(i == cur.length()-1){
                sb.append(num);
                sb.append(c);
            }
        }
        return get(n-1,sb.toString());
    }
}