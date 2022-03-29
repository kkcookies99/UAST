class Solution {
    public String XXX(String a, String b) {
        int max = (a.length() > b.length())?a.length():b.length();
        byte[] aa = a.getBytes();
        byte[] bb = b.getBytes();
        int[] cc = new int[max];
        int[] dd = new int[max];
        int[] ee = new int[max+1];
        for(int i=0;i<max;i++) {
            if(aa.length > bb.length)  {
                dd[i] = aa[i] - 48;
                cc[i] = (i < aa.length- bb.length)?0:bb[i-(aa.length- bb.length)]-48;
            }
            else {
                dd[i] = bb[i]-48;
                cc[i] = (i < bb.length - aa.length)?0:aa[i-(bb.length- aa.length)]-48;
            }
        }
        int flag=0;
        for(int i=max-1;i>=0;i--) {
            int shang = (dd[i] + cc[i] + flag) % 2;
            flag = (dd[i] + cc[i] + flag) / 2;
            ee[i+1] = shang;
        }
        ee[0] = flag;
        String str = "";

        for(int i=0;i< ee.length;i++) {
             if(i == 0 && ee[0] ==0) {continue;}
             str += ee[i];
        }
        return str;
    }
}

