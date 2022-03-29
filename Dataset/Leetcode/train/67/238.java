 class Solution {
    public String XXX(String a, String b) {
        int pa = a.length()-1;
        int pb = b.length()-1;
        int flag=0;
        StringBuilder sb = new StringBuilder();
        while (pa>=0||pb>=0){
            int tmpa = pa<0?0:a.charAt(pa)-48;
            int tmpb = pb<0?0:b.charAt(pb)-48;
            int num = tmpa+tmpb+flag;
            if(num>=2){
                num%=2;
                flag = 1;
            }else {
                flag = 0;
            }
            sb.insert(0,(char)(num+48));
            pa--;
            pb--;
        }
        if(flag==1){
            sb.insert(0,'1');
        }
        return sb.toString();
    }
}

