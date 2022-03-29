class Solution {
    public int XXX(int x) {
        int len = (x+"").length();
        int innum = 0;
        int[] a = new int[len];
        if(x > 0){
            while (x != 0){
                int i = 0;
                a[i] = (int) ((x % 10) *(Math.pow(10,(x+"").length()-1)));
                x /= 10 ;
                innum +=a[i];
            }
            return innum;
        }else if (x < 0){
            x = 0-x;
            while (x != 0) {
                int i = 0;
                a[i] = (int) ((x % 10) *(Math.pow(10,(x+"").length()-1)));
                x /= 10;
                innum += a[i];
            }
            return 0-innum;

        }else {
            return 0;
        }
    }
}

