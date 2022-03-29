class Solution {
    public String XXX(String a, String b) {
        if ("".equals(a)&&"".equals(b)) return 0+"";
        Stack<Integer> stack=new Stack<>();
        int asize=a.length();
        int bsize=b.length();
        if (asize<bsize){
            for (int i=0;i<bsize-asize;i++){
                a="0"+a;
            }
        }else if (asize>bsize){
            for (int i=0;i<asize-bsize;i++){
                b="0"+b;
            }
        }
        System.out.println(a+"\n"+b);
        char[] aStr=a.toCharArray();
        char[] bStr=b.toCharArray();
        int ans=0;
        for (int i=a.length()-1;i>=0;i--){
            int temp=ans+Integer.valueOf(String.valueOf(aStr[i]))+Integer.valueOf(String.valueOf(bStr[i]));
            if (temp<=1){
                stack.push(temp);
                ans=0;
            }else if (temp==2){
                stack.push(0);
                ans=1;
            }else {
                stack.push(1);
                ans=1;
            }
        }
        if (ans==1){
            stack.push(ans);
        }
        StringBuilder stringBuilder=new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


