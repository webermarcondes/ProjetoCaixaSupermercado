package Entidades;
import Enums.TipoPessoa;

import java.time.LocalDate;
import javax.swing.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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


            int selecao = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione a opção:\n 1- Cadastro\n 2- Cadastro Produto\n 3- Venda ", "Tela Inicial", JOptionPane.QUESTION_MESSAGE));
            if (selecao == 1) {
                // identificação do cliente

                String[] opcoesCadastroCliente = {"Sim", "Não"};
                int op = JOptionPane.showOptionDialog(null, "O cliente possui cadastro?", "Dados do cliente", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesCadastroCliente, opcoesCadastroCliente[0]);

                if (op == 0) {
                    System.out.println("sim");
                    int op1 = JOptionPane.showOptionDialog(null, "O cliente deseja utilizar seu cadastro na venda", "a", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesCadastroCliente, opcoesCadastroCliente[0]);
                } else if (op == 1) {

                    TipoPessoa[] tiposPessoa = TipoPessoa.values();
                    TipoPessoa tipoPessoa = TipoPessoa.getTipobyId(JOptionPane.showOptionDialog(null, "Selecione o tipo de cliente Atendido", "Tipo de cliente", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tiposPessoa, tiposPessoa[0]));

                    Endereco enderecoCliente = new Endereco();
                    Pessoa pessoa = new Pessoa();
                    if (tipoPessoa == TipoPessoa.PESSOA_FISICA) {
                        PessoaFisica pf = new PessoaFisica();


                        pf.setNome(JOptionPane.showInputDialog(null, "Digite o nome do Cliente", "Cadastro do cliente", JOptionPane.QUESTION_MESSAGE));
                        pf.setCpf(JOptionPane.showInputDialog(null, "Digite o cpf do cliente", "Cadastro do cliente", JOptionPane.QUESTION_MESSAGE));
                        pf.setTelefone(JOptionPane.showInputDialog(null, "Digite o Telefone do cliente", "Cadastro do cliente", JOptionPane.QUESTION_MESSAGE));
                        pf.setEmail(JOptionPane.showInputDialog(null, "Digite o E-mail do cliente", "Cadastro do cliente", JOptionPane.QUESTION_MESSAGE));

                        pf.setDataNascimento(LocalDate.parse(JOptionPane.showInputDialog(null, "Digite a data de Nascimento do cliente (dd/mm/yyyy)", "Cadastro do cliente", JOptionPane.QUESTION_MESSAGE),
                                DateTimeFormatter.ofPattern("dd/MM/yyyy")));

                        pessoa = pf;
                    } else if (tipoPessoa == TipoPessoa.PESSOA_JURIDICA) {
                        PessoaJuridica pj = new PessoaJuridica();

                        pj.setNome(JOptionPane.showInputDialog(null, "Digite o nome do Cliente", "Cadastro do cliente", JOptionPane.QUESTION_MESSAGE));
                        pj.setCnpj(JOptionPane.showInputDialog(null, "Digite o Cnpj do cliente", "Cadastro do cliente", JOptionPane.QUESTION_MESSAGE));
                        pj.setTelefone(JOptionPane.showInputDialog(null, "Digite o Telefone do cliente", "Cadastro do cliente", JOptionPane.QUESTION_MESSAGE));
                        pj.setEmail(JOptionPane.showInputDialog(null, "Digite o E-mail do cliente", "Cadastro do cliente", JOptionPane.QUESTION_MESSAGE));
                        pj.setInscricaoEstadual(JOptionPane.showInputDialog(null, "Digite a inscrição Estadual do cliente", "Cadastro do cliente", JOptionPane.QUESTION_MESSAGE));
                        pj.setRazaoSocial(JOptionPane.showInputDialog(null, "Digite a razão social do cliente", "Cadastro do cliente", JOptionPane.QUESTION_MESSAGE));

                        pessoa = pj;

                    }

                    enderecoCliente.setCep(JOptionPane.showInputDialog(null, "Digite o cep do cliente", "Endereço do cliente", JOptionPane.QUESTION_MESSAGE));
                    enderecoCliente.setComplemento(JOptionPane.showInputDialog(null, "Digite o complemento do endereço do cliente", "Endereço do cliente", JOptionPane.QUESTION_MESSAGE));
                    enderecoCliente.setBairro(JOptionPane.showInputDialog(null, "Digite o nome do bairro do cliente", "Endereço do cliente", JOptionPane.QUESTION_MESSAGE));
                    enderecoCliente.setCidade(JOptionPane.showInputDialog(null, "Digite a cidade do cliente", "Endereço do cliente", JOptionPane.QUESTION_MESSAGE));
                    enderecoCliente.setMunicipio(JOptionPane.showInputDialog(null, "digite o nome do municipio do cliente", "Endereço do cliente", JOptionPane.QUESTION_MESSAGE));

                    String[] ufs = {"SC", "SP", "RS"};
                    JOptionPane.showInputDialog(null, "Selecione a UF do cliente", "Endereço do cliente", JOptionPane.INFORMATION_MESSAGE, null, ufs, ufs[0]);

                }

            }else if (selecao == 2){
                boolean cadastro = true;
                ItemVenda cadastroItem = new ItemVenda();
                while (cadastro == true) {

                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do produto:");
                    Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor"));
                    Integer quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade"));
                    cadastroItem.cadastrarProduto(nome, valor, quantidade);

                    Integer cadastroPergunta = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja continuar cadastrando? \n 1 - Sim\n 2 - Não "));
                    if (cadastroPergunta == 2){
                        cadastro = false;
                    }
                }
                cadastroItem.mostrarItens();

            }else if (selecao == 3){

                Venda venda = new Venda();

                   Integer adicionarProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto:", "Balcão", JOptionPane.QUESTION_MESSAGE));
                   venda.adicionaItem(adicionarProduto);


                System.out.println(venda.cupomFiscal());
            }

        else if (x == 1) { //saida do sistema
            System.out.println("saindo");
            }
        }
    }
}