    public int XXX(int x) {
        if(x == 0){
            return 0;
        }
        else{
            return (int)newtonIteration(x, x);
        }
    }

    public double newtonIteration(double i, int x){
        double res = (i + x/i) / 2;
        if(res == x){
            return i;
        }
        else{
            return newtonIteration(res, x);
        }
    }


