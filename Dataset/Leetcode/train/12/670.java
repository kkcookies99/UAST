 class Solution {
    public String XXX(int num) {
        char[] word = new char[]{'I','V','X','L','C','D','M'};
        String str = Integer.toString(num);
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < n;i++){
            int count = Math.max(0, str.charAt(i) - '0');
            String s = String.valueOf(word[2 * (n - i) - 2]);
            if(str.charAt(i) - '0' <= 3){
                sb.append(s.repeat(count));
            }
            else if(str.charAt(i) - '0' == 4) {
                sb.append(word[2 * (n - i) - 2]);
                sb.append(word[2 * (n - i) - 1]);
            }
            else if(str.charAt(i) - '0' == 5) sb.append(word[2 * (n - i) - 1]);
            else if(str.charAt(i) - '0' <= 8){
                sb.append(word[2 * (n - i) - 1]);
                sb.append(s.repeat(count - 5));
            }
            else if(str.charAt(i) - '0' == 9) {
                sb.append(word[2 * (n - i) - 2]);
                sb.append(word[2 * (n - i)]);
            }
        }
        return sb.toString();
    }
}

