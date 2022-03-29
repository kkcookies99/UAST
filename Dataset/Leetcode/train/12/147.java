 class Solution {
    private StringBuffer str;
    public String XXX(int num) {
        str = new StringBuffer();
        set (num/1000,'M','\0','\0');
        set((num/100)%10,'C','D','M');
        set((num/10)%10,'X','L','C');
        set(num%10,'I','V','X');

        return str.toString();
    }

    private void set(int n, char I, char V, char X){
        if(n==9){
            str.append(I);
            str.append(X);
        }else if(n>=5){
            str.append(V);
            for (int i = 0; i < (n - 5); i++) {
                str.append(I);
            }
        }else if(n==4){
            str.append(I);
            str.append(V);
        }else {
            for (int i = 0; i < n; i++) {
                str.append(I);
            }
        }
    }
}

