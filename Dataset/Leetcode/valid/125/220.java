 public boolean XXX(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            while (!Character.isDigit(s.charAt(l)) && !Character.isLetter(s.charAt(l))) {
                ++l;
                if (l > r) return true;
            }
            while (!Character.isDigit(s.charAt(r)) && !Character.isLetter(s.charAt(r))) {
                --r;
                if (l > r) return true;
            }
            if (Character.toUpperCase(s.charAt(l)) == Character.toUpperCase(s.charAt(r))) {
                ++l;
                --r;
            } else return false;
        }
        return true;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


