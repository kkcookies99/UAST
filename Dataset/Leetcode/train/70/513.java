class Solution {
    public int XXX(int n) {

        if (n == 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else 
        {
            int p = 1;
            int q = 2;
            int s = q;

            for (int i = 2; i < n; i++)
            {
                s = p + q;
                p = q;
                q = s;
            }

            return s;
        }
    }
}

