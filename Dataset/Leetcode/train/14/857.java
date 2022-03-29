     public String XXX(String[] strs) {
     if (strs == null || strs.length == 0) {
                return "";
            }
            StringBuffer sb = new StringBuffer();
            int length = strs[0].length();
            int count = strs.length;
            if(count == 1) return strs[0];
            for (int i = 0; i < length; i++) {
                char c = strs[0].charAt(i);
                for (int j = 1; j < count; j++) {
                    if ((i+1) > strs[j].length()||c != strs[j].charAt(i)) return sb.toString();
                    }
                sb.append(c);
                }
        return sb.toString();
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


