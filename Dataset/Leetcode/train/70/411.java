public int XXX(int n) {
        int num1 = 0;      
        int num2 = 1;

        while (0 != n) {
            int temp = num2;
            num2 = num2 + num1;
            num1 = temp;
            n--;
        }

        return num2;
    }

