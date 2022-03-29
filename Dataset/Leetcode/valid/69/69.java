class Solution {
    public int XXX(int x) {

        if (x==1){
            return 1;
        }

        return XXX(x,0,x);

    }

    public int XXX(int x ,int idx1,int idx2){
        if (idx2 - idx1 > 1){
            int tmp = (idx1 + idx2) / 2;
            long tmp2 = (long) tmp * (long) tmp;
            int sqrt =(int) tmp2 !=  tmp2 ? 0 : tmp * tmp;
            //System.out.println(idx1 + "=" + idx2 + "==>" + sqrt);

            if (x == sqrt){
                return tmp;
            } else if (x > sqrt && sqrt != 0){
                return XXX(x,tmp,idx1 < idx2 ? idx2 : idx1);
            } else {
                return XXX(x,idx1 < idx2 ? idx1 : idx2,tmp);
            }
        }
        return idx1 < idx2 ? idx1 : idx2;
    }
}

