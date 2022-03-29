 public int XXX(String s) {
        Vector sb = new Vector();
        int len = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!sb.contains(s.charAt(i))) {
                sb.add(s.charAt(i));
                len++;
                if(len>max){
                    max=len;
                }
            } else {
                sb.clear();
                sb.add(s.charAt(i));
                len = 1;
                if(len>max){
                    max=len;
                }
            }
        }
        return max;

    }

