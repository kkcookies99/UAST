 public String XXX(int num) {
        StringBuilder res=new StringBuilder();
        if(num!=0){
            int n=num/1000;
            num%=1000;
            res.append("M".repeat(Math.max(0, n)));
        }
        if(num!=0){
            int n=num/100;
            num%=100;
            if(n==9){
                res.append("CM");
            }else if(n==4){
                res.append("CD");
            }else {
                int a=n/5;
                int b=n%5;
                res.append("D".repeat(Math.max(0, a)));
                res.append("C".repeat(Math.max(0, b)));
            }
        }
        if(num!=0){
            int n=num/10;
            num%=10;
            if(n==9){
                res.append("XC");
            }else if(n==4){
                res.append("XL");
            }else {
                int a=n/5;
                int b=n%5;
                res.append("L".repeat(Math.max(0, a)));
                res.append("X".repeat(Math.max(0, b)));
            }
        }
        if(num!=0){
            if(num ==9){
                res.append("IX");
            }else if(num ==4){
                res.append("IV");
            }else {
                int a= num /5;
                int b= num %5;
                res.append("V".repeat(Math.max(0, a)));
                res.append("I".repeat(Math.max(0, b)));
            }
        }


        return res.toString();
    }

