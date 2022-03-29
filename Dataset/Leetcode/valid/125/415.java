 class Solution {
    public boolean XXX(String s) {
       String [] str =s.split("[^a-zA-Z0-9]+");
       StringBuffer stringBuffer=new StringBuffer();
       for(int i=0;i<str.length;i++){
           stringBuffer.append(str[i]);
       }
       return new String(stringBuffer).equalsIgnoreCase(new String(stringBuffer.reverse()));

    }
}

