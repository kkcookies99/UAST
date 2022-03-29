 class Solution {
    public String XXX(String a, String b) {
        if(a == null || b == null || a.length() == 0 || b.length() == 0){
            return "0";
        }
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int carry = 0;
        String result = "";
        while (aIndex >= 0 || bIndex >= 0){
            int aNum = aIndex < 0 ? 0 : (a.charAt(aIndex --) - '0');
            int bNum = bIndex < 0 ? 0 : (b.charAt(bIndex --) - '0');
            int sum = aNum ^ bNum ^ carry;
            carry = (aNum + bNum + carry) >> 1;
            result = sum + result;
        }
        
        if(carry != 0){
            result = carry + result;
        }
        return result;
    }
}

