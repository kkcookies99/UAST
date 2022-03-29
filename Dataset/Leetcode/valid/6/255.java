 class Solution {
    public String XXX(String s, int numRows) {
List<List<String>> list = new ArrayList<>();
        if(numRows==1){
            return s;
        }
        for (int i = 0; i <numRows; i++) {
            list.add(new ArrayList<>());
        }

        int index = 0;
        String direction = "down";
        for (int i = 0; i < s.length(); i++) {
            char val = s.charAt(i);
            list.get(index).add(val+"");
            if (direction.equals("down")) {
                if (index < numRows ) {
                    index++;
                }
                if (index == numRows) {
                    index = numRows - 2;
                    direction = "up";
                }
            }else{
                if (index > 0) {
                    index--;
                }else if(index==0) {
                    index = 1;
                    direction = "down";
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                stringBuilder.append(list.get(i).get(j));
            }
        }
        return stringBuilder.toString();
    }
}

