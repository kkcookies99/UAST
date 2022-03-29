 class Solution {
    public  String XXX(String s) {
        if(s==null||s.length()==0){
            return "";
        }
        String result=String.valueOf(s.charAt(0));
        int maxLength=1;
        int length = s.length();
        int index;
        for (int i = 0; i < length; i++) {
            int end=length;
            while ((index=s.lastIndexOf(s.charAt(i),end))!=-1){
                if(index-i<maxLength){
                    break;
                }
                if(f(s.substring(i,index+1))){
                    maxLength=index-i+1;
                    result=s.substring(i,index+1);
                    break;
                }else {
                    end=index-1;
                    if(end-i<maxLength){
                        break;
                    }
                }
            }
        }


        return result;
    }

    public  boolean f(String s){

        int length = s.length();
        boolean result=true;
        for (int i = 0 , j = length-1 ; i < j; i++,j--) {
            if(s.charAt(i)!=s.charAt(j)){
                result=false;
                break;
            }
        }

        return result;
    }

}

