     public String XXX(String a, String b) {
        char[] as = new StringBuilder(a).reverse().toString().toCharArray();
        char[] bs = new StringBuilder(b).reverse().toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        int tmp = 0, index = 0, minLength = Math.min(as.length, bs.length);
        while (index < minLength) {
            tmp += (as[index] - '0' + bs[index] - '0');
            sb.append(tmp % 2);
            tmp /= 2;
            index++;
        }
        if (index == as.length) {
            addLeft(sb, bs, index, tmp);
        } else {
            addLeft(sb, as, index, tmp);
        }
        return sb.reverse().toString();
    }
    public void addLeft(StringBuilder sb,char[] ss,int index,int tmp) {
        while (index < ss.length) {
            tmp += (ss[index] - '0');
            sb.append(tmp % 2);
            tmp /= 2;
            index++;
        }
        if(tmp!=0){
            sb.append(1);
        }
    }

