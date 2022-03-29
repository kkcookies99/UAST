class Solution {
    Map<String, String[]> automata = new HashMap(){{
        put("start", new String[]{"start", "singed", "inNumber", "end"});
        put("singed", new String[]{"end", "end", "inNumber", "end"});
        put("inNumber", new String[]{"end", "end", "inNumber", "end"});
        put("end", new String[]{"end", "end", "end", "end"});
    }};
    
    public int XXX(String str) {
        long nas = 0L;
        char[] chars = str.toCharArray();
        String state = "start";
        int singed = 1;
        for(char c : chars){
            state = getStat(c, state);
            switch (state){
                case "singed":
                    singed = c == '-' ? -1 : singed;
                    break;
                case "inNumber":
                    nas = nas * 10 + c - '0';

                    if(singed * nas > Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }

                    if(singed * nas < Integer.MIN_VALUE){
                        return Integer.MIN_VALUE;
                    }
                    break;
                case "end":
                    return singed * (int) nas;
                case "start":
                default:
                    break;
            }
        }
        return (int) (singed * nas);
    }

    public String getStat(char c, String state){
        switch (c){
            case ' ':
                return automata.get(state)[0];
            case '+':
            case '-':
                return automata.get(state)[1];
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return automata.get(state)[2];
            default:
                return automata.get(state)[3];
        }
    }
}

