public int XXX(int n) {
        if(n <= 0){
            return 0;
        }
        int[] cases = new int[n + 1];
        cases[0] = 0;
        cases[1] = 1;
        if(cases.length >= 3){
            cases[2] = 2;
        }
        for(int i = 3; i < cases.length; i++){
            cases[i] = cases[i - 2] + cases[i - 1];
        }
        return cases[cases.length - 1];
    }

