public boolean XXX(int x) {

        if (x < 0) {
            return false;
        }

        long sum = 0;
        int mod = 10;
        int num = x;

        while (num != 0) {

            sum = sum * mod + num % mod;
            num /= mod;
        }

        if (sum == x) {
            return true;
        }

        return false;
    }