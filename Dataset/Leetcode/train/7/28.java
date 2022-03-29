class Solution {
      public int XXX(int x) {
        if(x<0){
            StringBuilder stringBuilder=new StringBuilder(String.valueOf(-x));
            stringBuilder.XXX();
            if(stringBuilder.toString().compareTo("2147483647")>0&&stringBuilder.length()>=10){
                return 0;
            }else{
                return Integer.valueOf(String.valueOf(stringBuilder))*-1;
            }

        }else{
            StringBuilder stringBuilder=new StringBuilder(String.valueOf(x));
            stringBuilder.XXX();
            if(stringBuilder.toString().compareTo("2147483647")>0&&stringBuilder.length()>=10){
                return 0;
            }else{
                return Integer.valueOf(String.valueOf(stringBuilder))*1;
            }
        }
    }
}

