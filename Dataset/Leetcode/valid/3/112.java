 class Solution {
    public int XXX(String s) {
        char[] chars = s.toCharArray();
        ArrayList<Character> temp = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        boolean flag = true;
        for (int i = 0; i < chars.length - 1; i++) {
            temp.add(chars[i]);
            for (int j = i + 1; j < chars.length; j++) {
                for (int k = 0; k < temp.size(); k++) {
                    if(chars[j] == temp.get(k)){
                        flag = false;
                        break;
                    }
                }
                if(flag == false){
                    flag = true;
                    break;
                }
                temp.add(chars[j]);
                count++;
            }
            temp.removeAll(temp);
            list.add(count);
            count = 1;
        }
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

