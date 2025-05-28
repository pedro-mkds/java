import javax.swing.*;
import java.awt.*;

public class TelaEstilizada extends JFrame {

    // Agora a label é atributo da classe, acessível por qualquer método
    private JLabel lblMsg;

    public TelaEstilizada() {
        setTitle("Interface Bonita");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setBackground(new Color(230, 230, 230));
        painel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Cria e configura o label
        lblMsg = new JLabel("Aqui vai aparecer a Mensagem");
        lblMsg.setFont(new Font("Arial", Font.BOLD, 24));
        lblMsg.setForeground(Color.RED);
        lblMsg.setName("lblMsg");

        gbc.gridy = 0;
        painel.add(lblMsg, gbc);

        // Cria e configura o botão
        JButton btnClick = new JButton("Clique em Mim!");
        btnClick.setFont(new Font("Arial", Font.PLAIN, 18));
        btnClick.setFocusPainted(false);
        btnClick.setName("btnClick");

        // Ação do botão
        btnClick.addActionListener(e -> btnClickActionPerfomed());

        gbc.gridy = 1;
        painel.add(btnClick, gbc);

        add(painel);
    }

    // Método que será chamado quando o botão for clicado
    private void btnClickActionPerfomed() {
        lblMsg.setText("Olá Mundo!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaEstilizada tela = new TelaEstilizada();
            tela.setVisible(true);
        });
    }
}
