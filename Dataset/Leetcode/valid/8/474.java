 class Solution {
    public int XXX(String s) {
        boolean shouldAdd = false;
        boolean hasSymbol = false;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!shouldAdd) {
                if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                    if (hasSymbol) {
                        return 0;
                    }
                    result.append(s.charAt(i));
                    hasSymbol = true;
                } else if (s.charAt(i) > 48 && s.charAt(i) < 58) {
                    result.append(s.charAt(i));
                    shouldAdd = true;
                } else if (s.charAt(i) == '0') {
                    hasSymbol = true;
                } else if (s.charAt(i) == ' ') {
                    if (hasSymbol) {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else if (s.charAt(i) > 47 && s.charAt(i) < 58) {
                result.append(s.charAt(i));
            } else {
                break;
            }
            if (result.length() >= 12) {
                break;
            }
        }
        try {
            return Integer.parseInt(result.toString());
        } catch (Exception ignored) {
            if (result.length() <= 1) {
                return 0;
            }
            if (result.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


