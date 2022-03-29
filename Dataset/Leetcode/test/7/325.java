class Solution {
    private static String XXX(String str) {
        if (str == null || str.equals(""))
            return str;
        return str.charAt(str.length() - 1) + XXX(str.substring(0, str.length() - 1));
    }
    public int XXX(int x) {
        String s=Integer.toString(Math.abs(x));
        s=XXX(s);
        if(x<0)
        {
            try {
                x=Integer.parseInt("-"+s);
            } catch (Exception e) {
                return 0;
            }
        }
        else 
        {
            try {
                x=Integer.parseInt(s);
            } catch (Exception e) {
                return 0;
            }
        }
        return x;
    }
}

