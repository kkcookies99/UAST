     public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        result.add(new ArrayList<>(1));
        result.get(0).add(1);
        int aResultLength = 2;
        for (int i = 1; i < numRows; i++) {
            List<Integer> aResult = new ArrayList<>(aResultLength--);
            aResult.add(1);
            for (int j = 1; j < aResultLength; j++) {
                aResult.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            aResult.add(1);
            result.add(aResult);
            aResultLength += 2;
        }
        return result;
    }

