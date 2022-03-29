 class Solution {
    public int XXX(String str) {
       int  num=0;  //计算最后数字
       int  sign=1; //符号位
        int limit=Integer.MAX_VALUE/10;//预防计算溢出
        int length=str.length();
        System.out.println(length);
        if (str==null||str.equals("")) return 0;
        int i=0;
        while(i<length-1&&str.charAt(i)==' ')
        {
            i++;
            
        } //退出循环时获得第一个非空格字符
          char a=str.charAt(i);
        if((a<'0'||a>'9')&&(a!='+')&&(a!='-')) //第一位不是可以转化成数字的
            return 0;
        else{  
            if(a=='-')
            {sign=-1;
             i++;
                
            }
            if(a=='+')
            {
                sign=1;
                i++;
            }
            if(i==length) return 0; //如果最后检测了 + -号之后没数字了还是返回0
            a=str.charAt(i);
             while(   a<='9'&&a>='0') //如果是数字
             { if (num<limit||(num==limit&&a<='7'))  //注意这一步是如何检测超过INT
                 num=num*10+a-'0';
               else {if(sign==1) return Integer.MAX_VALUE;
                      else  return Integer.MIN_VALUE;
                   
               }
                 if(i<length-1)
                  a=str.charAt(++i);
                else  break;
             }
              
            
        }
        return (num*sign);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


