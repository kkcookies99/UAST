class Solution {
    public boolean XXX(int x) {
        if(x < 0) return false;
        int cnt = 0;
        int []a = new int[100];
        while(x != 0){
            a[cnt++] = x%10;
            x /= 10;
        }
        for(int i =0; i < cnt; i++){
            if(i <= cnt-1-i && a[i] == a[cnt-1-i])
                continue;
            else if(a[i] != a[cnt-1-i])
                return false;
        }
        return true;
    }
}

