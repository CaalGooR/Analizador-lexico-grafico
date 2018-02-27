public class Analizador {

  private String palabra;
  private String aux;
  private int i;  // Esta variable ayudara a recorrer la palabra

  public Analizador (String cadena) {
      i = 0;
      palabra = cadena;
      estadoA();
  }

  private void estadoA () { // Estado inicial

    System.out.println("Estado A, i = "+i);
    if (i < palabra.length())
      aux = palabra.charAt(i) + "";

    if (aux.matches("[0-9]")) {
      i++;
      estadoG();
    }
    else if (aux.matches("[i]")) {
      i++;
      estadoB();
    }
    else if (aux.matches("[.]")) {
      i++;
      estadoE();
    }
    else if (aux.matches("[+-]")) {
      i++;
      estadoF();
    }
    else if (aux.matches("[a-h j-z A-Z]")) {
      i++;
      estadoD();
    }
    else
      System.out.println("Caracter no valido");

  }

  private void estadoB () {

    System.out.println("Estado B, i = "+i);
    if (i < palabra.length())
      aux = palabra.charAt(i) + "";

    if (aux.matches("[f]")) {
      i++;
      estadoC();
    }
    else if (aux.matches("[a-e g-z A-Z 0-9]")) {
      i++;
      estadoD();
    }
    else
      System.out.println("Caracter no valido");

  }

  private void estadoC () { // ACEPTACION de "if"

    System.out.println("Estado C, i = "+i);
    if (i < palabra.length())
      aux = palabra.charAt(i) + "";

    if (i < palabra.length()) { // verifica que el si termino de anaalizar la cadena
      if (aux.matches("[a-z A-Z 0-9]")) {
        i++;
        estadoB();
      }
      else
        System.out.println("Caracter no valido");
    }
    else
      System.out.println("if");
  }

  private void estadoD () { // ACEPTACION de "ID"

    System.out.println("Estado D, i = "+i);
    if (i < palabra.length())
      aux = palabra.charAt(i) + "";

    if (i < palabra.length()) { // verifica que el si termino de anaalizar la cadena
      if (aux.matches("[a-z A-Z 0-9]")) {
        i++;
        estadoD();
      }
      else
        System.out.println("Caracter no valido");
    }
    else
      System.out.println("Identificador");
  }

  private void estadoE () {

    System.out.println("Estado E, i = "+i);
    if (i < palabra.length())
      aux = palabra.charAt(i) + "";

    if (aux.matches("[0-9]")) {
      i++;
      estadoH();
    }
    else
      System.out.println("Caracter no valido");
  }

  private void estadoF () {

    System.out.println("Estado F, i = "+i);
    if (i < palabra.length())
      aux = palabra.charAt(i) + "";

    if (aux.matches("[0-9]")) {
      i++;
      estadoG();
    }
    else
      System.out.println("Caracter no valido");

  }

  private void estadoG () { //  ACEPTACION de "Numero"

    System.out.println("Estado G, i = "+i);
    if (i < palabra.length())
      aux = palabra.charAt(i) + "";

    if (i < palabra.length()) { // verifica que el si termino de anaalizar la cadena
      if (aux.matches("[0-9]")) {
        i++;
        estadoG();
      }
      else if (aux.matches("[.]")) {
        i++;
        estadoH();
      }
      else if (aux.matches("[e E]")) {
        i++;
        estadoI();
      }
      else
        System.out.println("Caracter no valido");
    }
    else
      System.out.println("Numerico");
  }

  private void estadoH () { //  ACEPTACION de "float"

    System.out.println("Estado H, i = "+i);
    if (i < palabra.length())
      aux = palabra.charAt(i) + "";

    if (i < palabra.length()) { // verifica que el si termino de anaalizar la cadena
      if (aux.matches("[0-9]")) {
        i++;
        estadoH();
      }
      else if (aux.matches("[e E]")) {
        i++;
        estadoI();
      }
      else
        System.out.println("Caracter no valido");
    }
    else
      System.out.println("float");
  }

  private void estadoI () {

    System.out.println("Estado I, i = "+i);
    if (i < palabra.length())
      aux = palabra.charAt(i) + "";

    if (aux.matches("[0-9]")) {
      i++;
      estadoK();
    }
    else if (aux.matches("[+-]")) {
      i++;
      estadoJ();
    }
    else
      System.out.println("Caracter no valido");

  }

  private void estadoJ () {

    System.out.println("Estado J, i = "+i);
    if (i < palabra.length())
      aux = palabra.charAt(i) + "";

    if (aux.matches("[0-9]")) {
      i++;
      estadoK();
    }
    else
      System.out.println("Caracter no valido");
  }

  private void estadoK () { // ACEPTACION de "float"

    System.out.println("Estado K, i = "+i);
    if (i < palabra.length())
      aux = palabra.charAt(i) + "";

    if (i < palabra.length()) { // verifica que el si termino de analizar la cadena
      if (aux.matches("[0-9]")) {
        i++;
        estadoK();
      }
      else
        System.out.println("Caracter no valido");

    }
    else
      System.out.println("float");
  }

}
