class Main {
  public static void main(String[] args) {
    String code = "ЕСКЕУГЬГМХИФЯ Е УЛП";
    for (char symbol : code.toCharArray()) {
      if (symbol != ' ') {
        symbol = (char) (symbol - 3);
      }
      System.out.print(symbol);
    }
  }
}