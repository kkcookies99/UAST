public int XXX(String s) {
        char[] romanChar = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < romanChar.length; i++) {
            if (romanChar[i] == 'M') {
                sum += 1000;
            } else if (romanChar[i] == 'D') {
                sum += 500;
            } else if (romanChar[i] == 'C') {
                if (i + 1 < romanChar.length) {
                    if (romanChar[i + 1] == 'D') {
                        sum += 400;
                        i++;
                    } else if (romanChar[i + 1] == 'M') {
                        sum += 900;
                        i++;
                    } else {
                        sum += 100;
                    }
                } else {
                    sum += 100;
                }
            } else if (romanChar[i] == 'L') {
                sum += 50;
            } else if (romanChar[i] == 'X') {
                if (i + 1 < romanChar.length) {
                    if (romanChar[i + 1] == 'L') {
                        sum += 40;
                        i++;
                    } else if (romanChar[i + 1] == 'C') {
                        sum += 90;
                        i++;
                    } else {
                        sum += 10;
                    }
                } else {
                    sum += 10;
                }
            } else if (romanChar[i] == 'V') {
                sum += 5;
            } else if (romanChar[i] == 'I') {
                if (i + 1 < romanChar.length) {
                    if (romanChar[i + 1] == 'V') {
                        sum += 4;
                        i++;
                    } else if (romanChar[i + 1] == 'X') {
                        sum += 9;
                        i++;
                    } else {
                        sum += 1;
                    }
                } else {
                    sum += 1;
                }
            } else {
                sum += 0;
            }
        }
        return sum;
    }

