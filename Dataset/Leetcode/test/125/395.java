 class Solution {
    public boolean XXX(String s) {
       	s=s.toLowerCase();
        char[]ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        	if(ch[i]>'z'||ch[i]<'a')
            if(ch[i]>'9'||ch[i]<'0')
            ch[i]=' ';
        String fin=String.valueOf(ch).replaceAll(" ", "");      
        return fin.equals(new StringBuilder(fin).reverse().toString());
    }
}

