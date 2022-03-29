 class Solution {
    public int XXX(String s) {
        if(s.length()==0) return 0;
        StringBuilder sb = new StringBuilder();
        int i=s.length()-1;
        while(i>=0&&s.charAt(i)==' '){
            i--;
        }
        if(i==-1) return 0;
        for(int j=i;j>=0;j--){
            if(s.charAt(j)!=' '){
                sb.append(s.charAt(j));
            }else{
                break;
            }
        }
        return sb.toString().length();
    }
}

