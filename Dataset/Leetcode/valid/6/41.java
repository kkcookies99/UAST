 class Solution {
    public String XXX(String s, int numRows) {
           
            if(numRows == 1){
                return s;
            }
                 
             char[] str = s.toCharArray();
             int j = 0, k = 0;
             int t = 0;
             char[] strCon = new char[s.length()];
             for(int i = 1; i <= numRows; i++){
                 t = 0;
                 for(j = i - 1; j < s.length(); k++){
                     
                     strCon[k] = str[j];
                     if(i==1) {
                         j = numRows * 2 - 2 * i + j;
                     }
                      else if(i==numRows) {
                         j =j = j + 2 * i -2;
                     }
                    else if(t % 2 == 0){
                           j = numRows * 2 - 2 * i + j;
                     }else{
                         j = j + 2 * i -2;
                     }
                     t++;
                 }
             }
             String st=String.valueOf(strCon);
             return st;
    } 
}

