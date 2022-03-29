 public String XXX(String a, String b) {
        int maxSize = Math.max(a.length(),b.length());
        char[] da1 = new char[maxSize];
        char[] da2 = new char[maxSize];
        char[]  re = new char[maxSize+1];  //可能有进位
        Arrays.fill(da1,'0');
        Arrays.fill(da2,'0');
        Arrays.fill(re,'0');
        System.arraycopy(a.toCharArray(),0,da1,maxSize-a.length(),a.length());
        System.arraycopy(b.toCharArray(),0,da2,maxSize-b.length(),b.length());
        byte carry = 0;  //进位标志
        for(int i=maxSize-1;i>=0;i--){
            byte tmp = (byte) ((da1[i]-'0')+(da2[i]-'0')+carry);
            switch (tmp){
                case 0:
                    re[i+1] = '0';
                    carry = 0;
                    break;
                case 1:
                    re[i+1] = '1';
                    carry = 0;
                    break;
                case 2:
                    re[i+1] = '0';
                    carry = 1;
                    break;
                case 3:
                    re[i+1] = '1';
                    carry = 1;
                    break;
            }
        }
        if(carry>0){
            re[0] = '1';
            return new String(re);
        }else{
            String tmp = new String(re);
            return tmp.substring(1);
        }
    }

