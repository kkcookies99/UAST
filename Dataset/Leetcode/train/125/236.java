 class Solution {
    public boolean XXX(String s) {
        //base case
        if(s.equals("")){
            return true;
        }

        StringBuffer str=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        int i=0,j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}

