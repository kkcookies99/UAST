 class Solution {
    public int XXX(String s) {
        char[] chars= s.toCharArray();
        int i=0;
        long sum=0;
        int count=0;
        boolean fu=false;
        while(i!=s.length())
        {
            int index=Integer.valueOf(chars[i]);
            int index2=0;
            if(i+1!=s.length()) {
                index2 = Integer.valueOf(chars[i + 1]);
            }
            //如果不是数字或者+，-，空格则跳出
            if(!((index>=48&&index<=57)||index==32||index==45||index==43)){
                break;
            }
            //如果出现+-后面跟着+，-，空格则跳出
            if((index==43||index==45)&&(index2==43||index2==45||index2==32))
            {
                break;
            }
            //碰到-号
            if(index==45&&(index2>=48&&index2<=57))
            {
                fu=true;
            }
            else if(index>=48&&index<=57)
            {
                sum=sum*10+(index-48);
                if(sum>2147483647) {
                    break;
                }
                if(index!=48) {
                    count++;
                }
                if(count==0&&(index2==32||index2==43||index2==45)) {
                    break;
                }
                if(index2==32||index2==45||index2==43) {
                break;
              }
            }
            i++;
        }
        if((int)sum!=sum){
            if(fu==true)
            {
                sum=-2147483648;
            }
            else {
                sum = 2147483647;
            }
        }
        else{
            if(fu==true)
            {
                sum=-sum;
            }
        }
        return (int)sum;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


