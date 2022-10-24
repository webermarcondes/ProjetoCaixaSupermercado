import java.time.LocalDate;
import javax.swing.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

//        Object selection = JOptionPane.showInputDialog(null, "Selecione o usuario?",
//                "SeguradoraAPP", JOptionPane.QUESTION_MESSAGE, null, listaDeValores, valorInicial);

        Endereco endereco = new Endereco("88803270", "", "são luis", "criciúma",
                "criciúma", "SC", 180);

        PessoaFisica pfFuncionario = new PessoaFisica("weber", "48996721490",
                "weber152040@gmail.com", endereco, "5257891102", LocalDate.now());

        Funcionario funcionario  = new Funcionario(pfFuncionario, 10, LocalDate.now(), "10");
        Login login = new Login("weber", "1010", funcionario);


        String[] opcoes = {"Logar", "Sair"};



        int x = JOptionPane.showOptionDialog(null, "Clique na opção desejada", "Sistema caixa", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);


        if(x == 0) {//opção logar no sistema

            String usuario;
            String senha;

            do {
                usuario = JOptionPane.showInputDialog(null, "digite seu usuário", "Login de Funcionário", JOptionPane.QUESTION_MESSAGE);
                senha = JOptionPane.showInputDialog(null, "digite sua Senha", "Login de Funcionário", JOptionPane.QUESTION_MESSAGE);


                if (!usuario.equals(login.getUsuario()) || !senha.equals(login.getSenha())) {
                    JOptionPane.showMessageDialog(null, "Dados Incorretos, tente Novamente");
                }

            } while (!usuario.equals(login.getUsuario()) || !senha.equals(login.getSenha()));




            // identificação do cliente



            String[] opcoesCadastroCliente = {"Sim", "Não"};
            int op = JOptionPane.showOptionDialog(null, "O cliente possui cadastro?", "Dados do cliente", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesCadastroCliente, opcoesCadastroCliente[0]);

            TipoPessoa[] tiposPessoa = TipoPessoa.values();
            TipoPessoa tipoPessoa = TipoPessoa.getTipobyId(JOptionPane.showOptionDialog(null, "Selecione o tipo de cliente Atendido", "Tipo de cliente", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null , tiposPessoa, tiposPessoa[0]));

            if(op == 0) {
                System.out.println("sim");
            }

            else if (op == 1) {

                Endereco enderecoCliente = new Endereco();
                if (tipoPessoa == TipoPessoa.PESSOA_FISICA) {
                    PessoaFisica pf = new PessoaFisica();


                    pf.setNome(JOptionPane.showInputDialog(null, "Digite o nome do Cliente", "Cadastro do cliente",JOptionPane.QUESTION_MESSAGE));
                    pf.setCpf(JOptionPane.showInputDialog(null, "Digite o cpf do cliente", "Cadastro do cliente",JOptionPane.QUESTION_MESSAGE));
                    pf.setTelefone(JOptionPane.showInputDialog(null, "Digite o Telefone do cliente", "Cadastro do cliente",JOptionPane.QUESTION_MESSAGE));
                    pf.setEmail(JOptionPane.showInputDialog(null, "Digite o E-mail do cliente", "Cadastro do cliente",JOptionPane.QUESTION_MESSAGE));

                    pf.setDataNascimento(LocalDate.parse(JOptionPane.showInputDialog(null,"Digite a data de Nascimento do cliente (dd/mm/yyyy)", "Cadastro do cliente",JOptionPane.QUESTION_MESSAGE),
                            DateTimeFormatter.ofPattern("dd/MM/yyyy")));


                }

                else if (tipoPessoa == TipoPessoa.PESSOA_JURIDICA) {
                    System.out.println("");
                }




            }









        }


        else if (x == 1) { //saida do sistema
            System.out.println("saindo");
        }





    }
}