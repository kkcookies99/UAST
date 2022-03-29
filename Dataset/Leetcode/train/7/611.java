 class Solution {
    public int XXX(int x) {
         if(x>=0) {
            StringBuffer sringBuffer = new StringBuffer(String.valueOf(x));
            StringBuffer XXX = sringBuffer.XXX();
            if((Long.parseLong(String.valueOf(XXX))>2147483647 || ( Long.parseLong(String.valueOf(XXX)))<-2147483648)){
                return 0;
            }
            x = (int) Long.parseLong(String.valueOf(XXX));
            return x;
        }else{
            StringBuffer sringBuffer = new StringBuffer(String.valueOf(x));
            StringBuffer XXX = sringBuffer.XXX();
            String s = String.valueOf(XXX);
            String s1 = "-"+s.substring(0, s.length()-1);
            if(( Long.parseLong(String.valueOf(s1))>2147483647 || ( Long.parseLong(String.valueOf(s1)))<-2147483648)){
                return 0;
            }
            x = (int) Long.parseLong(String.valueOf(s1));
            return x;
        }

    }
}

