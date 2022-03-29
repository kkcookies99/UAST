 public int XXX(int x) {
    int XXX = 0;
    try {
        while (x != 0) {
            XXX = Math.addExact(Math.multiplyExact(XXX, 10), x % 10);
            x = x / 10;
        }
    } catch (ArithmeticException e) {
        return 0;
    }
    return XXX;
}

