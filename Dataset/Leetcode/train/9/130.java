class Solution {
    public boolean XXX(int x) {
        if(x < 0)
            return false;
        StringBuilder num = new StringBuilder(String.valueOf(x));
        return num.toString().equals(num.reverse().toString());
    }
}

