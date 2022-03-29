class Solution {
    public boolean XXX(int x) {
       int y=x;
        int number=0;

        while(x>0) {
            number = x % 10 + number * 10;
            x=x/10;
        }
        System.out.println(number);
        return y == number;
    }
}

