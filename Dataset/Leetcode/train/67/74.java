 class Solution {
    public String XXX(String a, String b) {
        StringBuilder res = new StringBuilder();
        int iA = a.length() - 1;
        int iB = b.length() - 1;
        // 进位
        int carry = 0;
        while( 0 <= iA || 0 <= iB || carry == 1){
            // 统计1的个数
            int count = carry;
            if(0 <= iA){
                count += a.charAt(iA--) - '0';
            }
            if(0 <= iB){
                count += b.charAt(iB--) - '0';
            }
            res.append(count % 2);
            // 大于2, 进位
            carry = count / 2;
        }
        return res.reverse().toString();
    }
}

