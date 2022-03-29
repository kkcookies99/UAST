 class Solution {
    public String XXX(int num) {
        StringBuffer rtn = new StringBuffer();
        switch(num / 1000){
            case 1 : rtn.append("M");
            break;
            case 2 : rtn.append("MM");
            break;
            case 3 : rtn.append("MMM");
            break;
        }
        num = num - num/1000 * 1000;
        switch(num / 100){
            case 1 : rtn.append("C");
            break;
            case 2 : rtn.append("CC");
            break;
            case 3 : rtn.append("CCC");
            break;
            case 4 : rtn.append("CD");
            break;
            case 5 : rtn.append("D");
            break;
            case 6 : rtn.append("DC");
            break;
            case 7 : rtn.append("DCC");
            break;
            case 8 : rtn.append("DCCC");
            break;
            case 9 : rtn.append("CM");
            break;
        }
        num = num - num/100 * 100;
        switch(num / 10){
            case 1 : rtn.append("X");
            break;
            case 2 : rtn.append("XX");
            break;
            case 3 : rtn.append("XXX");
            break;
            case 4 : rtn.append("XL");
            break;
            case 5 : rtn.append("L");
            break;
            case 6 : rtn.append("LX");
            break;
            case 7 : rtn.append("LXX");
            break;
            case 8 : rtn.append("LXXX");
            break;
            case 9 : rtn.append("XC");
            break;
        }
        num = num - num/10 * 10;
        switch(num){
            case 1 : rtn.append("I");
            break;
            case 2 : rtn.append("II");
            break;
            case 3 : rtn.append("III");
            break;
            case 4 : rtn.append("IV");
            break;
            case 5 : rtn.append("V");
            break;
            case 6 : rtn.append("VI");
            break;
            case 7 : rtn.append("VII");
            break;
            case 8 : rtn.append("VIII");
            break;
            case 9 : rtn.append("IX");
            break;
        }
        return rtn.toString();
    }
}

