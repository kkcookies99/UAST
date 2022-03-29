 class Solution {
    public int XXX(String s) {
              int index = s.lastIndexOf(' ');
        int i = 1;
        do{
            if(index == s.length() - i){
                index = s.lastIndexOf(' ',index - 1);
                i++;
            }
            if(index != s.length()-i){
             break;   
            }
        }while (true);
       
        int len = s.length()- index - i;
        return len;
    }
}   

