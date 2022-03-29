 class Solution {
    public int XXX(int x) {
        StringBuilder build =new StringBuilder();
        String s=String.valueOf(x);
        for(int i=s.length()-1;i>0;i--){
            build.append(s.charAt(i));
        }
        char f =s.charAt(0);
        int value;
        if(f!='-') build.append(f);
        try{
            value = Integer.parseInt(build.toString());
        }
        catch(Exception e){
            return 0;
        }
        if(f=='-') value=(-1)*value;
        return value;
    }
}

