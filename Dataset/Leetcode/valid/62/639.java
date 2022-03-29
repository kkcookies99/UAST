class Solution {
    public int XXX(int m, int n) {
        return path(1, 1, m, n);
    }

    public int path(int curM, int curN, int m,int n)
    {
        if(curM > m || curM < 0)
            return 0;
        if(curN > n || curN < 0)
            return 0;
        if(curM == m && curN == n)
            return 1;
        return path(curM+1, curN, m,n) +  path(curM, curN+1, m,n);
        
    }
}

