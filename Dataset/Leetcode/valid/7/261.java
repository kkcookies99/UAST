class Solution {
    public int XXX(int x) {
        String s =  x+"";

        String ss = "";
        for(int i = s.length() ; i>0;i--){
            String sub = s.substring(i-1,i);
            if(ss.equals("") && sub.equals("0")){
                continue;
            }
            if(sub.equals("-")){
                ss = "-"+ss;
                continue;
            }
            ss = ss+sub;
        }

        int r = 0;
        try{
            r = Integer.parseInt(ss);
        }catch(Exception e){
            return 0;
        }
        return r;

    }
}

