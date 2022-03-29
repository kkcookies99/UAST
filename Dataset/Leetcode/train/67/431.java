class Solution {
    public String XXX(String a, String b) {
        int aEnd=a.length()-1;
        int bEnd=b.length()-1;
        char[] achars=a.toCharArray();
        char[] bchars=b.toCharArray();
        StringBuilder res=new StringBuilder();
        int carry=0;
        while(aEnd>=0||bEnd>=0){
            int ac=aEnd>=0?(achars[aEnd]-'0'):0;
            int bc=bEnd>=0?(bchars[bEnd]-'0'):0;
            int sum=ac+bc+carry;
            carry=sum/2;
            sum=sum%2;
            res.append(sum);
            aEnd--;
            bEnd--;
        }

        if(carry==1){
            res.append(carry);
        }

        return res.reverse().toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


