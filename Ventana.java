import javax.swing.*;

public class Ventana {

  private JFrame frame;
  private JButton btn;
  private JLabel lbl1;
  private JTextField txtCadena;

  public Ventana() {
    inicializarComponentes();
  }

  private void inicializarComponentes () {

    frame = new JFrame ("Analizador Lexico Grafico");
    frame.setSize(400,200);
    frame.setResizable(false);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }


}
