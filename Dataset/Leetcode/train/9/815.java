 class Solution {
    public boolean XXX(int x) {
        StringBuilder sb = new StringBuilder(new String(String.valueOf(x)));
        return sb.reverse().toString().equals(String.valueOf(x)) ? true : false;
    }
}

