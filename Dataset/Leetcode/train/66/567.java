class Solution {
    public int[] XXX(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
                continue;
            }else{
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        int[] returnD = new int[digits.length + 1];
        returnD[0] = 1;
        return returnD;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


