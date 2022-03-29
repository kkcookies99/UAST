 class Solution {
    public boolean XXX(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c>=97&&c<122 || c>=48&&c<58){
                sb.append(c);
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}

