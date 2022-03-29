 class Solution {
    public String XXX(String s) {
        int left = 0, rigth = s.length() - 1;
        return word(left, rigth, s);
    }


    public String word(int left, int rigth, String s){
        int leftnum = left;
        int rigthnum = rigth;
        while(leftnum < rigthnum){
            if(s.charAt(leftnum) == s.charAt(rigthnum) && leftnum + 1 == rigthnum){
                leftnum++;
                rigthnum++;
                return s.substring(leftnum, rigthnum);
            }else{
                return word(left + 1, rigth, s)  ||  word(left, rigth + 1, s);
            }
        }
        return s.substring(leftnum, rigthnum);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


