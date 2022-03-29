 class Solution {
    public boolean XXX(String s) {
        s=s.toLowerCase();
        StringBuffer sb =new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }

        if(sb.toString().equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }
}

