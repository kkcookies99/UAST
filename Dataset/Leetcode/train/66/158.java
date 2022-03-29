 class Solution {
    public int[] XXX(int[] digits) {
        List<Integer> res = new ArrayList<>();
        int n = digits.length;
        boolean carry = false;
        for ( int i = n-1; i >= 0; i-- ) {
            int digit = i == n-1 ? digits[i]+1 : digits[i];
            if ( carry ) {
                digit ++;
                carry = false;
            }
            if ( digit >= 10 ) {
                carry = true;
                res.add(digit%10);
            } else {
                res.add(digit);
            }
        }
        if ( carry ) {
            res.add(1);
        }
        Collections.reverse(res);
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
}

