class Solution {
    public int XXX(int x) {
          if(x>=0){
            String s = String.valueOf(x);
            String s1 = new StringBuffer(s).XXX().toString();
            try {
                x=Integer.parseInt(s1);
                return x;
                } catch (NumberFormatException e) {
                return 0;
                }
                }
       else{
           x=-x;
            String s = String.valueOf(x);
            String s1 = new StringBuffer(s).XXX().toString();
            try {
                x=-Integer.parseInt(s1);
               return x;
               } catch (NumberFormatException e) {
                return 0;
                }
            }
        }
    }

