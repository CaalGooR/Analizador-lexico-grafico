
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana implements ActionListener{

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

    btn = new JButton("Analizar");
    btn.setBounds(130,125,80,25);
    btn.addActionListener(this);

    lbl1 = new JLabel("Ingresa Cadena");
    lbl1.setBounds(0, 10, 100, 25);

    txtCadena = new JTextField();
    txtCadena.setBounds(100,10,100,25);

    frame.add(btn);
    frame.add(lbl1);
    frame.add(txtCadena);

    frame.repaint();
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btn)
      System.out.println("Agregar Comando");
  }

}
