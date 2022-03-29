 class Solution {
    public int XXX(String s) {
        String[] str=s.split(" ");
        for (int i= str.length-1;i>=0;i--){
            if(str[i].length()!=0){
                return str[i].length();
            }
        }
        return 0;
    }
}

