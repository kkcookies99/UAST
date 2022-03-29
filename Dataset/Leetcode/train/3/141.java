  public static int XXX(String s) {

        char[] chars = s.toCharArray();

        List<String> newList = new ArrayList<>();

        for (Character character : chars) {
            newList.add(String.valueOf(character));
        }

        List<List<String>> allList = new ArrayList<>();

        for (int i = 0; i < newList.size(); i++) {

            List<String> list = new ArrayList<>();

            list.add(newList.get(i));
            for (int j = i + 1; j < newList.size(); j++) {
                if (!(list.contains(newList.get(j)))) {
                    list.add(newList.get(j));
                } else {
                    break;
                }
            }
            allList.add(list);
        }

        if (allList.size() == 0) {
            return 0;
        } else if (allList.size() == 1) {
            return allList.size();
        } else {
            for (int i = 0; i < allList.size() - 1; i++) {
                if (allList.get(i).size() < allList.get(i+1).size()) {
                    allList.remove(i--);
                } else {
                    allList.remove(i+1);
                    i--;
                }
            }
            return allList.get(0).size();
        }
    }

