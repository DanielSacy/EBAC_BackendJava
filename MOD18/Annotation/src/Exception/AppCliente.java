package Exception;


import javax.swing.JOptionPane;

public class AppCliente {
    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null, "Digite o codigo do cliente", "",JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.consultarCliente(opcao);
        } catch (ClienteNaoEncontradoException e) {
            //System.out.println("Cliente não encontrado: " + opcao);  //e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage() + opcao, "Error",JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
