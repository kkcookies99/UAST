 class Solution {
    public String XXX(int num) {
        StringBuilder res = new StringBuilder();
        int[] numArr = new int[4];
        for(int i=3;i>=0;i--){
            numArr[i] = num % 10;
            num /= 10;
        }
        for(int i=0;i<numArr[0];i++){
            res.append('M');
        }
        if(numArr[1]==9) res.append("CM");
        else if(numArr[1] == 4) res.append("CD");
        else{
            if(numArr[1] >= 5){
                res.append('D');
                numArr[1] -= 5;
            }
            for(int i=0;i<numArr[1];i++) res.append('C');
        }

        if(numArr[2]==9) res.append("XC");
        else if(numArr[2] == 4) res.append("XL");
        else{
            if(numArr[2] >= 5){
                res.append('L');
                numArr[2] -= 5;
            }
            for(int i=0;i<numArr[2];i++) res.append('X');
        }
        if(numArr[3]==9) res.append("IX");
        else if(numArr[3] == 4) res.append("IV");
        else{
            if(numArr[3] >= 5){
                res.append('V');
                numArr[3] -= 5;
            }
            for(int i=0;i<numArr[3];i++) res.append('I');
        }
        return res.toString();
    }
}

