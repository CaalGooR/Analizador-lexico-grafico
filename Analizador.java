public class Analizador {

  protected String palabra;

  public Analizador (String cadena) {
      palabra = cadena;
      System.out.println(miRango("a","z"));
  }

  private boolean esNumero() {
    return (palabra.matches("\\d*(\\.\\d+)?") && palabra.equals("")==false);
  }

  private boolean miRango(String a,String b) {
    return (palabra.matches("[" +a+ "-" +b+ "]"));
  }
}
