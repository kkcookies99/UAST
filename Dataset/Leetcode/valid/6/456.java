 class Solution {
    public String XXX(String s, int numRows) {
          int length=s.length();
        if(length==1||numRows==1||length<numRows){
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder(length);
        for(int i=0;i<numRows;i++){
            stringBuilder.append(s.charAt(i));
            int tmp=i;
            if(i == 0 || i==numRows-1){
                tmp=tmp+2*numRows-2;
                while(tmp<length){
                    stringBuilder.append(s.charAt(tmp));
                    tmp=tmp+2*numRows-2;
                }
            }else{
                tmp=tmp+2*numRows-2*(i+1);
                while(tmp<length){
                    stringBuilder.append(s.charAt(tmp));
                    tmp=tmp+2*i;
                    if(tmp<length){
                        stringBuilder.append(s.charAt(tmp));
                        tmp=tmp+2*numRows-2*(i+1);
                    }else{
                        break;
                    }
                }
            }
        }
        return stringBuilder.toString();

    }
}

