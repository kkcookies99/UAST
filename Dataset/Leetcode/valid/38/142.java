class Solution {
    public static String XXX(int n) {

        StringBuilder str = new StringBuilder("1");

        for (int i = 1; i < n; i++) {

           StringBuilder newStr = new StringBuilder();
           char[] chars = str.toString().toCharArray();
           int index = 0;
           int sum = 1;

           while (index+1 < chars.length) {
               if (chars[index] == chars[index+1]) {
                   index++;
                   sum++;
               } else {
                   newStr.append(sum);
                   newStr.append(chars[index]);
                   index++;
                   sum = 1;
               }
           }

            newStr.append(sum);
            newStr.append(chars[index]);
            str = newStr;
        }

        return str.toString();
    }
}

