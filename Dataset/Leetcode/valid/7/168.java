class Solution {
    public int XXX(int x) {
        int newX = 0;
        while (x != 0)
        {
            if (newX != newX*10/10)
            {
                return 0;
            }
            newX *= 10;
            newX += x % 10;
            x = x / 10;
        }
        return newX;
    }
}

