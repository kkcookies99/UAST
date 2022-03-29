class Solution {
    public String XXX(int n) {
        if(n == 1){
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        String str = XXX(n-1);
        char start = str.charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == start){
                count++;
            }else{
                sb.append(count);
                sb.append(start);
                start = str.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(start);
        return sb.toString();
    }
}

