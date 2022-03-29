class Solution {
    public int XXX(int x) {
        int XXXd = 0;

        while (x != 0) {
            if (XXXd < -214748364 || XXXd > 214748364) {
                XXXd = 0;
                break;
            } // if (XXXd < -214748364 || XXXd > 214748364)

            XXXd = XXXd * 10 + x % 10;
            x /= 10;
        } // while (x != 0)

        return XXXd;
    } // XXX(int)
} // Solution Class

