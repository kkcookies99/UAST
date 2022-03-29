 class Solution {
    public boolean XXX(String s) {   
        return new StringBuilder((s=s.replaceAll("[^0-9a-zA-Z]+","") )).reverse().toString().equalsIgnoreCase(s);
    }    
}

