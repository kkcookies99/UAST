class Solution {
    public boolean XXX(int x) {
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}

