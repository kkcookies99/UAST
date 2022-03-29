 class Solution {
    public String getString(int num,String ss[]){  // num [0,9]
        StringBuilder s = new StringBuilder();
        if(num <= 3){
            for(int i = 0;i < num;++i){
                s.append(ss[0]);
            }
        }else if(num == 4){
            s.append(ss[0]);  //IV = 4
            s.append(ss[1]);

        }else if(num < 9){
            s.append(ss[1]);
            for(int i = 0;i < num-5;++i){
                s.append(ss[0]);
            }
        }else{
            s.append(ss[0]);  //IX = 9
            s.append(ss[2]);
        }
        return s.toString();

    }
    public String XXX(int num) {
        String s1[] = {"I","V","X"};
        String s2[] = {"X","L","C"};
        String s3[] = {"C","D","M"};
        String s4[] = {"M","M","M"};
        StringBuilder re = new StringBuilder();
        int cnt = num/1000;
        if(cnt != 0)  re.append(getString(cnt,s4));
        cnt = num/100%10;
        if(cnt != 0)  re.append(getString(cnt,s3));
        cnt = num/10%10;
        if(cnt != 0)  re.append(getString(cnt,s2));
        cnt = num%10;
        if(cnt != 0)  re.append(getString(cnt,s1));
        return re.toString();
    }
}

