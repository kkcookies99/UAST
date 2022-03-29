 class Solution {
    public String XXX(String a, String b) {
            int i = a.length()-1;
            int j = b.length()-1;
            int add =0;
        StringBuffer str = new StringBuffer();
        while( i >= 0 || j >= 0 || add !=0){
             int num = add;
             num += i>=0 ? a.charAt(i) - '0' : 0;
             num += j>=0 ? b.charAt(j) - '0' : 0;

             str.append(num % 2);
            add = num /2;
                 i--;
                 j--;
                }
        return str.append(add == '1' ? add : "").reverse().toString();
              }
    }


