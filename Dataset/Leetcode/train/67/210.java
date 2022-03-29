 class Solution {
    public String XXX(String a, String b) {
        int carryBit = 0;
        StringBuilder sb = new StringBuilder();
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        while(aIndex >= 0  || bIndex >= 0 || carryBit != 0) {
            int aValue = (aIndex < 0) ? 0 : a.charAt(aIndex) - '0';
            int bValue = (bIndex < 0) ? 0 : b.charAt(bIndex) - '0';
            int sum = aValue + bValue + carryBit;
            if(sum >= 2) {
                sum -= 2;
                carryBit = 1;
            }else{
                carryBit = 0;
            }
            sb.append(sum);
            aIndex --;
            bIndex --;
        } 
        return sb.reverse().toString();
    }
}

