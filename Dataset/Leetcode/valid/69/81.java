public int XXX(int x) {
        double x1 = 1, x2;
        x2 = x1 / 2.0 + x / (2 * x1);//牛顿迭代公式
        while (Math.abs(x2 - x1) > 1e-8) {//这句代码纯粹是为了控制x2与x1之间的精度，1e-8代表10^（-8）
            x1 = x2;
            x2 = x1 / 2.0 + x / (2 * x1);
        }
        return (int)x2;
    }

