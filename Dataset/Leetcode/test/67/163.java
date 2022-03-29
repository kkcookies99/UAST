 class Solution {
    public String XXX(String a, String b) {
        //双指针呗，加了就append呗
        StringBuilder sb = new StringBuilder();
        int lena = a.length();
        int lenb = b.length();
        int indexa = lena-1;
        int indexb = lenb-1;
        int carry = 0;
        while(indexa>=0 || indexb>=0 || carry>0){
            int numa = indexa<0?0:a.charAt(indexa--)-'0';
            int numb = indexb<0?0:b.charAt(indexb--)-'0';
            int num = (numa+numb+carry)%2;
            carry = (numa+numb+carry)/2;
            sb.append(num);
        }
        return sb.reverse().toString();
    }
}

