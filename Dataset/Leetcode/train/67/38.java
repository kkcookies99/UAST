 class Solution {
    public String XXX(String a, String b) {

        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        char[] newArr = null;

        // 将需要进行计算的两个数组变为一样长
        int shortLength = charA.length - charB.length;
        boolean AshortThanB = false;
        if (shortLength <= 0) {
            newArr = new char[charB.length];
            System.arraycopy(charA,0,newArr,newArr.length-charA.length,charA.length);
            AshortThanB = true;
        } else if (shortLength > 0) {
            newArr = new char[charA.length];
            System.arraycopy(charB,0,newArr,newArr.length-charB.length,charB.length);
        }

        // 拼接的结果
        StringBuilder sb = new StringBuilder();
        // 是否进位
        boolean carry = false;
        // 进行计算的单个值
        int x = 0;
        int y = 0;
        for (int i = newArr.length-1; i >= 0 ; i--) {

            if (AshortThanB) {
                x = Integer.parseInt(String.valueOf((newArr[i]=='\0' ? '0' : newArr[i])));
                y = Integer.parseInt(String.valueOf(charB[i]));
            } else {
                x = Integer.parseInt(String.valueOf(charA[i]));
                y = Integer.parseInt(String.valueOf((newArr[i]=='\0' ? '0' : newArr[i])));
            }
            int z = 0;

            // 计算逻辑
            if (x==0 && y==0 && carry) {
                z = 1;
                carry = false;
            } else if (x==0 && y==0 && !carry) {
                z = 0;
                carry = false;
            } else if (x==1 && y==1 && carry) {
                z = 1;
                carry = true;
            } else if (x==1 && y==1 && !carry) {
                z = 0;
                carry = true;
            } else if ((x==1 && y==0 && carry) || (x==0 && y==1 && carry)) {
                z = 0;
                carry = true;
            } else if ((x==1 && y==0 && !carry) || (x==0 && y==1 && !carry)) {
                z = 1;
                carry = false;
            }
            sb.insert(0,z);
        }
        if (carry) {
            sb.insert(0,1);
        }
        return sb.toString();
    }
}


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


