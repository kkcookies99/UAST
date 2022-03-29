 public int[] XXX(int[] digits) {
    String str = new BigInteger(Arrays.stream(digits).mapToObj(String::valueOf).collect(Collectors.joining(""))).add(BigInteger.ONE).toString();
    return Arrays.stream(str.split("")).mapToInt(Integer::valueOf).toArray();
}
