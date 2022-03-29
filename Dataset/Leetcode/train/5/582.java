 class Solution {
    public String XXX(String s) {
        String temp ="";
        for(int i=0;i<s.length();i++){
            String deep1 =deep(s,i,i);
            temp =deep1.length()>temp.length()?deep1:temp;
            String deep2 =deep(s,i,i+1);
            temp =deep2.length()>temp.length()?deep2:temp;
        }
        return temp;
    }

    public String deep(String s, int start ,int end){
        while(start>=0 && end<s.length()){
            if(s.charAt(start)==s.charAt(end)){
                start--;
                end++;
            }else{
                break;
            }
        }
        return s.substring(start+1,end);
    }
}

