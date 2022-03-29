class Solution {
    public String XXX(int n) {
        if(n==1){
            return "1";
        }
        String str = XXX(n-1);
        char temp = str.charAt(0);
        int tempNum = 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == temp){
                tempNum ++;
            }else{
                sb.append(tempNum).append(temp);
                temp = str.charAt(i);
                tempNum = 1;
            }
        }
        sb.append(tempNum).append(temp);
        return sb.toString();
    }
}

