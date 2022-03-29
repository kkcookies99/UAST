 class Solution {
    public String XXX(String s) {
        if(s==null || s=="")
            return null;
        int maxLength=0,start=0,end=0;
        for(int i=0;i<=s.length()-1;i++){
            for(int j=i;j<=s.length()-1;j++){
                Boolean flag=judge(s,i,j);
                if(flag && j-i+1>maxLength){
                    maxLength=j-i+1;
                    start=i;
                    end=j;
                }
            }
        }
        return s.substring(start,end+1);
    }
    public Boolean judge(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    } 
}

