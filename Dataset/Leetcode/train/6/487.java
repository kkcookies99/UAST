 public String XXX(String s, int numRows) {
        if (numRows==1 || numRows>=s.length()) return s;
        int count = s.length();
        int last=0,j=1;             //last是上一个字符行数，j是当前字符行数
        StringBuilder[] strings = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            strings[i]=new StringBuilder();
        }
        for (int i = 0; i < count; i++) {
            if (1<j&&j<numRows&&last<j){  //向下
                strings[j-1].append(s.charAt(i));
                last = j++;
            }else if (1<j&&j<numRows&&last>j){  //向上
                strings[j-1].append(s.charAt(i));
                last = j--;
            }else if (j==numRows){              //下头
                strings[j-1].append(s.charAt(i));
                last = j--;
            }else  {                            //上头
                strings[j-1].append(s.charAt(i));
                last = j++;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            builder.append(strings[i]);
        }
        return builder.toString();
    }

