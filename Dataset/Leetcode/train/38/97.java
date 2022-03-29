class Solution {
    int n = 0;
    public String XXX(int n) {
        if(n == 1) 
            return "1";
        String s = XXX(n - 1);
        StringBuilder sb = new StringBuilder("");
        n = s.length();
        for(int i = 0 , j = i; i < n;){
            if(j < n && s.charAt(i) == s.charAt(j)){
                j++;
            }else{
                sb.append(((j - i))+ s.substring(i,i + 1));
                i = j;
            }
        }
        return sb.toString();
    }
}

