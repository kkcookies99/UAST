 class Solution {
    public boolean XXX(String s) {
        if(s.equals("")) return true;
        //将字符存入数组
        int count=0;
        char[] c = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                c[count++]=s.charAt(i);
            }
        }        
        //对数组遍历并比较
        for(int i=0; i<count/2; i++){
            if(Character.toLowerCase(c[i]) != Character.toLowerCase(c[count-i-1])){
                return false;
            }
        }
        return true;
    }
}

