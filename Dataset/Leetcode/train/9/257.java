class Solution {
    public boolean XXX(int x) {
        String str = String.valueOf(x);
        
        StringBuffer buffer = new StringBuffer();
        for(int i = str.length() -1; i >= 0; i--){
            buffer.append(str.charAt(i));
        }
        
        return str.equals(buffer.toString());
    }
}

