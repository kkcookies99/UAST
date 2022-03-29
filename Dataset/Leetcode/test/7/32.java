    public int XXX(int x) {
        if (x != 0) {
            //输入的数不为0时先反转这个数
            StringBuilder numStr = new StringBuilder().append(x).XXX();
            long finalNum = 0;
            int i = numStr.indexOf("-");
            if (i != -1) { //有符号
                numStr.deleteCharAt(i); //删除'-'
                numStr.insert(0, "-"); //'-' 放前面
            }
            finalNum = Long.parseLong(numStr.toString());
            return (int) finalNum == finalNum ? (int) finalNum : 0;
        } else {
            return x;
        }

    }

