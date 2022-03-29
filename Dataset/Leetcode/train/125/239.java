 class Solution {
    public boolean XXX(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            int first=(int)s.charAt(i);
            int second=(int)s.charAt(j);
            while(!(first>=48&&first<=57)&&!(first>=65&&first<=90)&&!(first>=97&&first<=122)&&i<j){
                i++;
                first=(int)s.charAt(i);
            }
            while(!(second>=48&&second<=57)&&!(second>=65&&second<=90)&&!(second>=97&&second<=122)&&i<j){
                j--;
                second=(int)s.charAt(j);
            }
            if(first==second||(Math.abs(first-second)==32&&!(first>=48&&first<=57)&&!(second>=48&&first<=57))){
                i++;
                j--;
            }else{
                return false;
            }

        }
        return true;
    }
}

