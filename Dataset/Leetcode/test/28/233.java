 public int XXX(String haystack, String needle) {

        if(needle.length() < 1){
            return 0;
        }

        int n = 0;
        int m = needle.length();

        boolean flag = true;

        while(m <= haystack.length()){

            String tmp = haystack.substring(n,m);

            if(tmp.equals(needle)){
                flag = false;
                break;
            }

            n++;
            m++;

        }

        return flag ? -1:n;

    }