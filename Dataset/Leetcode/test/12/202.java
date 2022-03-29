 class Solution {
    public String XXX(int num) {
        String roman = "";
        if (num < 1 || num > 3999)
            return roman;
        int count = 1000;
        int tempNum = 0;
        for (;count >= 1;) {
            tempNum = num / count;
            num = num % count;
            switch (count) {
                case 1000:
                    for (int j = 0; j < tempNum; j++)
                        roman += "M";
                    break;
                case 100:
                    if (tempNum == 4) {
                        roman = roman + "CD";
                        tempNum = tempNum - 4;
                    }
                    else if (tempNum >= 5 && tempNum < 9) {
                        roman = roman + "D";
                        tempNum = tempNum - 5;
                    }
                    else if (tempNum == 9) {
                        roman = roman + "CM";
                        tempNum = tempNum - 9;
                    }
                    for (int j = 0; j < tempNum; j++)
                        roman += "C";
                    break;
                case 10:
                    if (tempNum == 4) {
                        roman = roman + "XL";
                        tempNum = tempNum - 4;
                    }
                    else if (tempNum >= 5 && tempNum < 9) {
                        roman = roman + "L";
                        tempNum = tempNum - 5;
                    }
                    else if (tempNum == 9) {
                        roman = roman + "XC";
                        tempNum = tempNum - 9;
                    }
                    for (int j = 0; j < tempNum; j++)
                        roman += "X";
                    break;
                case 1:
                    if (tempNum == 4) {
                        roman = roman + "IV";
                        tempNum = tempNum - 4;
                    }
                    else if (tempNum >= 5 && tempNum < 9) {
                        roman = roman + "V";
                        tempNum = tempNum - 5;
                    }
                    else if (tempNum == 9) {
                        roman = roman + "IX";
                        tempNum = tempNum - 9;
                    }
                    for (int j = 0; j < tempNum; j++)
                        roman += "I";
                    break;
            }
            count /= 10;
        }

        return roman;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


