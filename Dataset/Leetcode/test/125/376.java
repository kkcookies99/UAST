 class Solution {
    public boolean XXX(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1;
        while (l < r) {
            while (!isEffective(chars[l])) {
                l++;
                if(l > r) return true;
            }
            while (!isEffective(chars[r])) {
                r--;
                if (l > r) return true;
            }
            char left = toUpper(chars[l]), right = toUpper(chars[r]);
            if (left != right) return false;
            l++;
            r--;
        }
        return true;
    }

    boolean isEffective(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }

    char toUpper(char c) {
        if (c >= 'a' && c <= 'z')
            return (char) (c - 'a' + 'A');
        return c;
    }

}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


