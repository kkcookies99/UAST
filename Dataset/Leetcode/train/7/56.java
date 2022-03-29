class Solution {
    public int XXX(int x) {
       String s = new Integer(x).toString();
        StringBuilder sb;
        if (s.charAt(0)=='-'){
            try{
                sb = new StringBuilder(s.substring(1));
                int parse = Integer.parseInt(sb.XXX().toString());
                return  0-parse;
            }catch (NumberFormatException e){
                return  0;
            }
        }else{
            try{
                sb = new StringBuilder(s);
                int parse = Integer.parseInt(sb.XXX().toString());
                return  parse;
            }catch (NumberFormatException e){
                return 0;
            }

        }
    }
}

