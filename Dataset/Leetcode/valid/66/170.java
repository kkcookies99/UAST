 class Solution {
    public int[] XXX(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (++digits[i] < 10) {
                return digits;
            }
            digits[i] -= 10;
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


