class Solution {
    public int XXX(int n) {
        int a = 1;
        int b = 1;
        while (n-- > 1) {
            int temp = a;
            a = a + b;
            b = temp;
        }
        return a;
    }
}

