 class Solution {
    public boolean XXX(String s) {
        String str = s.toLowerCase();

        int left = 0;
        int right = str.length()-1;

        while(left < right) {
            while(left < right && !isNumOrChar(str.charAt(left))) left++;
            while(left < right && !isNumOrChar(str.charAt(right))) right--;
            if(str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isNumOrChar(char x) {
        return (x >= 'a' && x <= 'z') || (x >= '0' && x <='9');
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


