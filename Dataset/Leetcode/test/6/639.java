 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows<=1||s.length()==1||s==null){
            return s;
        }
        StringBuffer result=new StringBuffer(s.length());
        for(int i=0;i<numRows;i++){
            result.append(getStr(i,numRows,s));
        }
        //System.out.println(result.toString());
        return result.toString();
    }
    private String getStr(int curRow,int numRows,String s){//curRow=0...nuwRow-1
        int leftDistance=2*numRows-2-2*(curRow);
        int rightDistance=2*curRow;

        //System.out.println(leftDistance+" "+rightDistance);
        
        int curIndex=curRow;
        StringBuffer tmpStr=new StringBuffer();
        if(leftDistance>0&&rightDistance>0){
            while(curIndex<s.length()){
                tmpStr.append(s.charAt(curIndex));
                curIndex+=leftDistance;
                if(curIndex<s.length()){
                    tmpStr.append(s.charAt(curIndex));
                    curIndex+=rightDistance;
                }
            }
        }else if(leftDistance==0){
            while(curIndex<s.length()){
                tmpStr.append(s.charAt(curIndex));
                curIndex+=rightDistance;
            }
            //System.out.println(curIndex);
        }else if(rightDistance==0){
            while(curIndex<s.length()){
                tmpStr.append(s.charAt(curIndex));
                curIndex+=leftDistance;
            }
            //System.out.println(curIndex);
        }
        //System.out.println(tmpStr.toString());
        return tmpStr.toString();
    } 

}

