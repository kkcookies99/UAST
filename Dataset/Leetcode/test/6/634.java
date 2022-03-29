 class Solution {
    public String XXX(String s, int numRows) {
        if(s.length()<=numRows||numRows==1)
            return s;
        int len=s.length();
        char[] schar=s.toCharArray();
        int index=0;
        char[][] z=new char[numRows][len/2+1];
        int i=0,j=0;
        while(index<len){
            //先下
            while(i<numRows){
                z[i++][j]=schar[index++];
                if(index==len)
                    break;
            }
            if(index==len)
                    break;
            i-=2;
            j++;
            //斜上
            while(i>0){
                z[i--][j++]=schar[index++];
                if(index==len)
                    break;
            }
        }
        String res="";
        for(int k=0;k<numRows;k++){
           res+=new String(z[k]).replaceAll("\u0000", "");
        }
        //  res.replaceAll("\\u0000", "");
        return res;
    }   
}

