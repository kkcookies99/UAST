 class Solution {
    public int XXX(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int value = 0;
        for (int first = 0; first < s.length(); first++) {
            StringBuffer sb = new StringBuffer(s.length());
            for (int size = first; size < s.length(); size++) {
                if (sb.toString().contains(String.valueOf(s.charAt(size)))) {
                    value = sb.length() > value ? sb.length() : value;
                    break;
                }
                sb.append(s.charAt(size));
                value = sb.length() > value ? sb.length() : value;
            }
        }
        return value;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


