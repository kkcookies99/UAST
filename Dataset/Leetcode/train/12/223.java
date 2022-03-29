 class Solution {
    public String XXX(int num) {
        int qian = num/1000;
        int bai = num%1000/100;
        int shi = num%1000%100/10;
        int ge = num%1000%100%10;
        int[] numA = {qian, bai, shi, ge}; 
        StringBuilder toStr = new StringBuilder();
        for(int i = 0; i <= 3; i++) {
            if(numA[i]!=0) {
                getWei(i, numA, toStr);
            }
        }
        return toStr.toString();
    }

    public void getWei(int i, int[] numA, StringBuilder str) {
        if(numA[i]==0) return; 
        if(i==0) {
            //qian
            int n = numA[i];
            if(n<5) {
                for(int j = 0; j < n; i++) str.append("M");
            } 
        } else if(i==1) {
            //bai
            int n = numA[i];
            if(n<5) {
                if(n==4) str.append("CD");
                else {
                    for(int j = 0; j < n; j++) str.append("C");
                }
            } else {
                if(n==9) str.append("CM");
                else {
                    str.append("D");
                    for(int j = 0; j < n-5; j++) str.append("C");
                }
            }
        } else if(i==2) {
            //shi
            int n = numA[i];
            if(n<5) {
                if(n==4) str.append("XL");
                else{
                    for(int j = 0; j < n; j++) str.append("X");
                }
            } else {
                if(n==9) str.append("XC");
                else {
                    str.append("L");
                    for(int j = 0; j < n-5; j++) str.append("X");
                }
            }
        } else {
            //ge
            int n = numA[i];
            if(n<5) {
                if(n==4) str.append("IV");
                else {
                    for(int j = 0; j < n; j++) str.append("I");
                }
            } else {
                if(n==9) str.append("IX");
                else {
                    str.append("V");
                    for(int j = 0; j < n-5; j++) str.append("I");
                }
            }
        }
    }
}

