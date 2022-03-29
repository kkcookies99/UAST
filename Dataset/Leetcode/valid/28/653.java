 public int XXX(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }  
        if (haystack.length() == 0) {
            return -1;
        }
        char[] chars = needle.toCharArray();
        char[] chars1 = haystack.toCharArray();
        char temp = chars[0];
        int i = 0;
        for (int j = 0; j < chars1.length; j++) {
            if (chars1[j] == temp) {
                int k = j;
                while (i < chars.length) {
                    if (k >= chars1.length) {
                        return -1;
                    }
                    if (i == chars.length - 1 && chars1[k] == chars[i]) {
                        return j;
                    }
                    if (chars1[k] != chars[i]) {
                        i = 0;
                        break;
                    }
                    k++;
                    i++;
                }
            }
        }
        return -1;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


