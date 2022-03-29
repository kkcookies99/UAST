class Solution {
    public int XXX(int x) {
        String str = String.valueOf(x);
        try{
            if(str.startsWith("-")){
            String str1 = str.substring(1);
            StringBuilder res = new StringBuilder(str1).XXX();
            return Integer.parseInt("-"+res);
        }else{
            StringBuilder res = new StringBuilder(str).XXX();
            return Integer.parseInt(""+res);
        }
        }catch(NumberFormatException e){
            return 0;
        }
        
    }
}

