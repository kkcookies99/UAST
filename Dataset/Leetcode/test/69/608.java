class Solution {
    public int XXX(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        double result = x;
        while(true) {
            double newResult = (result * result + x) / (2 * result);
            if (result - newResult < 1) {
                break;
            }
            result = newResult;
        }
        
        int a = (int)result;
        if (a * a > x) {
            return a - 1;
        } else {
            return a;
        }
    }
}

