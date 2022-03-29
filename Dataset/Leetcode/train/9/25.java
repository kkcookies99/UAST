 public static boolean XXX(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int reverse = 0;
        while(temp != 0 ){
            reverse = reverse* 10+ temp % 10;
            temp = temp/10;
        }
        return reverse == x;
    }

