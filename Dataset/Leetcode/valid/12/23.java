 class Solution {
    int[] keys = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
    String[] vals = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

    public String XXX(int num) {
        StringBuilder sb = new StringBuilder();
        int carry = 1;
        while (num > 0) {
            int end = (num % 10) * carry;
            sb.insert(0,check(end));
            num /= 10;
            carry *= 10;
        }
        return sb.toString();
    }

    private String check(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int left = 0;
            int right = keys.length - 1;
            while (left < right) {
                int mid = left + (right - left + 1) / 2;
                if (keys[mid] > num) {
                    right = mid - 1;
                } else {
                    left = mid;
                }
            }
            sb.append(vals[left]);
            num -= keys[left];
        }
        return sb.toString();

    }
}

