 class Solution {
    public String XXX(int n) {
        StringBuilder str = new StringBuilder("1");
        while(n != 1){
            str = getStr(str);
            n--;
        }
        return str.toString();
    }

    public StringBuilder getStr(StringBuilder str){
        StringBuilder temp = new StringBuilder();
        int head = 0;
        int k;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(head)){
                k = (i - head);
                temp.append(k);
                temp.append(str.charAt(head));
                head = i;
            }
        }
        k = (str.length() - head);
        temp.append(k);
        temp.append(str.charAt(head));
        return temp;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


