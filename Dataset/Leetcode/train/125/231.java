 class Solution {
    public boolean XXX(String s) {
        String s1 = s.toLowerCase();
        int i = 0 ;
        int j = s1.length()-1;
        while(i != j){
            try{
                if (('0'<=s1.charAt(i) && s1.charAt(i)<='9') || ('a'<=s1.charAt(i) && s1.charAt(i)<='z')){

                }else{
                    i++;
                    continue;
                }
                if ('0'<=s1.charAt(j) && s1.charAt(j)<='9' || 'a'<=s1.charAt(j) && s1.charAt(j)<='z'){

                }else{
                    j--;
                    continue;
                }
            }catch (Exception e){
                return true;
            }
            if (s1.charAt(i) != s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

