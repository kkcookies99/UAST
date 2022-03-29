     class Solution {
        public int XXX(int x) {
            int y=0;
            long z=0;
            if (x>0) {
                while (x > 0) {
                    z = x % 10 + z * 10;
                    x = x / 10;
                }
            }
            else if (x<0){
                x=Math.abs(x);
                while (x > 0) {
                    z = x % 10 + z * 10;
                    x = x / 10;
                }
                z=z*-1;
            }
            y=z>Math.pow(2,31)-1||z<-1*Math.pow(2,31)?0:(int)z;
            return y;
        }
    }
