class Solution {
    public boolean XXX(int x) {
        if(x<0)return false;
        if(x<10)return true;
        if(x<100)return (x%11==0);
        return true;
    }
}

