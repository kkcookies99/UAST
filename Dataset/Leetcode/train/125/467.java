 class Solution {
    public boolean XXX(String s) {
        //正则表达式，去除其他字符
        String ss = s.replaceAll("[^a-zA-Z0-9]","");
        ss = ss.toLowerCase();
        int i=0;
        int j = ss.length()-1;
        while(i<j){
            if(ss.charAt(i)==ss.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}


