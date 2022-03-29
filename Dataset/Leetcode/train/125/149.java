 class Solution {
    public boolean XXX(String s) {
        s=s.trim().toLowerCase().replaceAll("[^a-z\\d]+","");
        if(s.length()==0||s.equals("")||s.equals(" "))
            return true;
        System.out.println(s);
        for (int i = 0; i < s.length()/2+1; i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
}

