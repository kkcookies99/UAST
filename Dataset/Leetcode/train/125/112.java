 public boolean XXX(String s) {
        StringBuilder res = new StringBuilder();
        boolean isPure = false;
        for (int num : s.toCharArray()) {
            if ((num >= 48 && num <= 57) || (num >= 97 && num <= 122)) {
                res.append((char) num);
                isPure = true;
            }
            if (num >= 65 && num <= 90) {
                res.append((char) (num + 32));
                isPure = true;
            }
        }
        String sFilter = res.toString();
        if (!isPure) {
            return true;
        }
        if (sFilter.length() == 0) {
            return false;
        }
        System.out.println(sFilter);
        for (int i = 0; i <= sFilter.length() / 2; i++) {
            if (sFilter.charAt(i) != sFilter.charAt(sFilter.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

