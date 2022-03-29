 class Solution {
    public String XXX(String s) {
        if(s.length()<2)return s;
        char c[]=s.toCharArray();
        StringBuilder res=new StringBuilder();
        res.append(c[0]);
        for(int i=1;i<c.length;i++){//找回文的中点
            if(c[i]==c[i-1]){//**bb**
                StringBuilder temp=new StringBuilder();
                for(int j=i;j<c.length;j++){
                    if(i-j+i-1>=0&&c[j]==c[i-j+i-1]){
                        temp.insert(0,c[j]);
                        temp.append(c[j]);
                    }else break;
                }
                if(temp.length()>res.length())res=temp;
            }
            if(i+1<c.length&&c[i+1]==c[i-1]){//**aba**
                StringBuilder temp=new StringBuilder();
                temp.append(c[i]);
                for(int j=i+1;j<c.length;j++){
                    if(i-j+i>=0&&c[j]==c[i-j+i]){
                        temp.insert(0,c[j]);
                        temp.append(c[j]);
                    }else break;
                }
                if(temp.length()>res.length())res=temp;

            }
        }
        return res.toString();
    }
}