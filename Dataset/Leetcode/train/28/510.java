     public int XXX(String haystack, String needle) {
    int l1 = haystack.length();
            int l2 = needle.length();
            if(l2 == 0){
                return 0;
            }
            if(l2 > l1){
                return -1;
            }

            for (int i = 0; i <= l1 - l2; i++) {
                if(haystack.charAt(i) == needle.charAt(0)){
                    boolean flag = true;
                    for (int j = 0; j < l2 && true; j++) {
                        if(haystack.charAt(j + i) != needle.charAt(j)){
                            flag = !flag;
                            break;
                        }
                    }
                    if(flag){
                        return i;
                    }
                }
            }
            return -1;    
    }

