class Solution {
    public String XXX(String a, String b) {
        String result = "";
        int n=0,r=0;
        int len1 = a.length();
        int len2 = b.length();
        String str = "";
        if(len1<len2){
            for(int i=0;i<len2-len1;i++){
                str = str + "0";
            }
            a = str + a;
            n = len2;
        } 
        else{
            for(int i=0;i<len1-len2;i++){
                str = str + "0";
            }
            b = str + b;
            n = len1;
        } 

        System.out.println(a+"\n"+b+"\n"+a.charAt(0));
        for(int i=n-1;i>=0;i--){
            if(a.charAt(i)+b.charAt(i)+r-2*48==2){
                result = "0" + result;
                r = 1;
            }else if(a.charAt(i)+b.charAt(i)+r-2*48==3){
                result = "1" + result;
                r = 1;
            }else{
                result = String.valueOf((int)a.charAt(i)+(int)b.charAt(i)-2*48+r) + result;
                r = 0;
            }
        }
        if(r==1)result = "1" + result;
        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


