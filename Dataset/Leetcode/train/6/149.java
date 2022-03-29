 class Solution {
    public String XXX(String s, int numRows) {
        int[] arr = new int[numRows];
        int remainder = 0;
        if(numRows>1){
            arr[1]=(s.length()-1)/(2*numRows-2)+1;
            remainder=s.length()-(arr[1]-1)*(2*numRows-2);
        }
        for(int i=2,c=0;i<numRows;i++){
            c=0;
            if(remainder>(i-1)){
                if (remainder>2*(numRows-1)-1-(i-2)) c=0;
                else c=1;
            }else c=2;
            arr[i]=arr[i-1]+2*arr[1]-c;
        }
        boolean move=true;
        char[] s2 = new char[s.length()];
        for (int i = 0,index=0; i <s.length() ; i++) {
            s2[arr[index]] = s.charAt(i);
            arr[index]++;
            if (numRows>1){
                if (move && index<numRows-1){
                    index++;
                } else if (index>0){
                    index--;
                    move = false;
                }else {
                    index++;
                    move = true;
                }
            }
        }
        return new String(s2);
    }
}

