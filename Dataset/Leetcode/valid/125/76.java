  public boolean XXX(String s) {
                if (s.equals("")) {
        	return true;
        }
		StringBuilder sb = new StringBuilder();
        sb.append(s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase());
        return sb.toString().equals(sb.reverse().toString());
    }`

