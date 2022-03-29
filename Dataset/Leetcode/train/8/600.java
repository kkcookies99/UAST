 class Solution {
    public int XXX(String s) {
        //去除前导空格
        while (s.startsWith(" ")){
            s=s.substring(1);
        }
        // 去除后若为空字符串则返回0
        if(s.length()==0) return 0;
        char[] ch = s.toCharArray();
        int flag=1;
        double result=0;
        for (int i=0;i<ch.length;i++){
            //开头为-，反转flag
            if (ch[i]=='-'&&i==0) {
                flag=-1;
                continue;
            }
            if (ch[i]=='+'&&i==0) continue;
            if (ch[i]>='0'&&ch[i]<='9'){
                int y = Integer.valueOf( String.valueOf(ch[i]));
                result = result*10+y;
            }else break;
        }
        result=result*flag;
        result=result<Integer.MIN_VALUE?Integer.MIN_VALUE:result;
        result=result>Integer.MAX_VALUE?Integer.MAX_VALUE:result;
        return (int) result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


