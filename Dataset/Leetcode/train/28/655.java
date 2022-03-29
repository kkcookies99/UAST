 public int XXX(String haystack, String needle) {
        if (needle.length()==0)return 0;

        if (needle.length()>haystack.length())return -1;


        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i)!=needle.charAt(0)){
                continue;
            }

            if (haystack.length()-i>=needle.length()){
                int j=0;
                while(j<needle.length()&&needle.charAt(j)==haystack.charAt(i+j)){
                    j++;
                }
                if (j==needle.length())return i;
            }else{
                return -1;
            }
        }
        return -1;
    }

