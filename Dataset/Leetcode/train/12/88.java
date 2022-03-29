 class Solution {
    public String XXX(int num) {
        Integer[] arr = new Integer[]{1, 4,5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] arr2 = new String[]{"I", "IV","V" ,"IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            int count = num / arr[i];
            int min=count * arr[i];
            num = min!=0?num % min:num;
            for (int j = 0; j < count; j++) {
                sb.append(arr2[i]);
            }
        }
        return sb.toString();
    }
}

