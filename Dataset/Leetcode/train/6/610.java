 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows==1)return s;
        String string = "";
        for (int i = 0; i < numRows; i++) {
            int i1 = i;
            while (i1<s.length()){
                if(i==0 || i==numRows-1){
                    string+=s.charAt(i1);
                }else {
                    string+=s.charAt(i1);
                    if((i1+(numRows-i)*2-2)<s.length()){
                        string+=s.charAt(i1+(numRows-i)*2-2);
                    }

                }
                i1+=numRows*2-2;
            }
        }
        return string;
    }
}

