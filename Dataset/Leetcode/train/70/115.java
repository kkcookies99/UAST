class Solution {
    public int XXX(int n) {
        double a = (Math.sqrt(5) + 1) / 2D;
        return (int) Math.round((Math.pow(a, n) * (a + 1) - (1 / Math.pow(a, n))) / (a + 2));
    }
}

