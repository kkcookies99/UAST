 class Solution {
    public String XXX(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();

        int i=a.length()-1;
        int j=b.length()-1;
        int log=0;
        while (i >=0&& j >=0) {
            int x = (a.charAt(i)-'0') + (b.charAt(j) -'0')+ log;
            log=0;//重置
            if(x>=2){
                log=1;
                x-=2;
            }
            stringBuilder.append(x);
            i--;
            j--;
        }
        if (i < 0 && j < 0) {
            if (log == 1) {
                stringBuilder.append(1);
            }
        } else if (i < 0) {
            while (j >= 0) {
                int x = + (b.charAt(j) -'0')+ log;
                log=0;//重置
                if(x>=2){
                    log=1;
                    x-=2;
                }
                stringBuilder.append(x);
                j--;
            }
            if (log == 1) {
                stringBuilder.append(1);
            }
        } else if (j < 0) {
            while (i >= 0) {
                int x = + (a.charAt(i) -'0')+ log;
                log=0;//重置
                if(x>=2){
                    log=1;
                    x-=2;
                }
                stringBuilder.append(x);
                i--;
            }
            if (log == 1) {
                stringBuilder.append(1);
            }
        }

        return stringBuilder.reverse().toString();
    }
}

