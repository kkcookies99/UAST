     public String XXX(String s) {
        String preString = getPreString(s);
        final char[] chars = preString.toCharArray();
        int n = chars.length;
        int[] r = new int[chars.length];
        int R = -1;
        int C = -1;
        int maxR = 0;
        int maxC = 0;

        for (int i = 0; i < n; i++) {
            r[i] = i<R ? Math.min(r[2 * C -i] , R -i):1;
            while( i-r[i]>=0 && i+r[i] < n){
                if(chars[i-r[i]] == chars[i+r[i]]){
                    r[i]++;
                }else{
                    break;
                }
            }
            if(i+r[i]>R){
                R = i+r[i];
                C = i;
            }
            if(r[i] > maxR){
                maxR = r[i];
                maxC = i;
            }
        }
        return  print(chars,maxC - maxR +1,maxC + maxR - 1);
    }

    private String getPreString(String s){
        StringBuilder sb = new StringBuilder("#");
        for(char c : s.toCharArray()){
            sb.append(c).append("#");
        }
        return sb.toString();
    }

    private String print(char[] chars , int l ,int r){
        StringBuilder sb = new StringBuilder();
        for (int i = l; i < r; i++) {
            if (chars[i]!='#'){
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }

