 class Solution {
    public int XXX(int x) {
        String s = "" + x;
        char[] c = s.toCharArray();
        int l = c.length;
        char[] res = new char[l];
        if(c[0] == '-'){
            res[0] = '-';
            for(int i=1;i<l;i++){
                res[l-i] = c[i]; 
            }
        }else{
            for(int i=0;i<l;i++){
                res[l-i-1] = c[i]; 
            }
        }
        String str = new String(res);
        int num = 0;
        try{
            num = Integer.parseInt(str.trim());
        }catch(Exception e){
            return num;
        }
        return num;
    }
}

