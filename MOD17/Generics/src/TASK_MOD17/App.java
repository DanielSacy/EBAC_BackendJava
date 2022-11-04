package TASK_MOD17;



import javax.swing.*;

import Cadastro.dao.ClienteMapDAO;
import Cadastro.dao.IClienteDAO;
import Cadastro.domain.Cliente;
import TASK_MOD17.dao.BrandMapDAO;
import TASK_MOD17.domain.Brand;
import TASK_MOD17.domain.GM;

/**
 * @author rodrigo.pires
 */
public class App {

    private static BrandMapDAO brandMapDAO;
    

    public static void main(String args[]) {
        brandMapDAO = new BrandMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar ou 5 para sair",
                "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        
        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida digite 1 para cadastro, 2 para consulta ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            
            if (isOpcaoSair(opcao)) {
                sair();
            }else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do Carro separados por vígula, conforme exemplo: Nome da marca, Modelo do carro, Chassi",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsulta(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente",
                        "Consulta cliente", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            // } else if (isExclusao(opcao)) {
            //     String dados = JOptionPane.showInputDialog(null,
            //             "Digite o CPF do cliente",
            //             "Consulta cliente", JOptionPane.INFORMATION_MESSAGE);
            //     excluir(dados);
            // } else {
            //     String dados = JOptionPane.showInputDialog(null,
            //     "Digite os dados do Carro separados por vígula, conforme exemplo: Nome da marca, Modelo do carro, Chassi",
            //             "Atualização", JOptionPane.INFORMATION_MESSAGE);
            //     atualizar(dados);
            // }

            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consulta, ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    // private static void atualizar(String dados) {
    //     String[] dadosSeparados = dados.split(",");
    //     Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
    //     brandMapDAO.alterar(cliente);
    // }

    // private static void excluir(String dados) {
    //     brandMapDAO.excluir(Long.parseLong(dados));
    //     JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
    // }


    private static void consultar(String dados) {
        Brand carro = brandMapDAO.consultar(Long.parseLong(dados));
        if (carro != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado com sucesso: " + carro.toString(), "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado", "ERRO",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Brand carro = new Brand();
        Boolean isCadastrado = brandMapDAO.cadastrar(carro);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static boolean isExclusao(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isConsulta(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        String carrosCadastrados = "";
        for (Brand carro : brandMapDAO.buscarTodos()) {
            carrosCadastrados += carro.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, "Clientes cadastrados: " + carrosCadastrados, "Até logo",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao)
                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }

}
