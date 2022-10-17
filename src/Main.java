import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

     Endereco endereco = new Endereco("a", "b", "s", "d", 4);
       PessoaFisica pf = new PessoaFisica("weber", "13996212714", "webermarcondesabc", endereco,"424.555", LocalDate.now());
//        PessoaJuridica pj = new PessoaJuridica("abcDefg", "13996242788", "abcdeFghi@gmail.com", endereco,"kjvbbkb", "1234567.44");
//
//        System.out.println(pf.getDocumentoPrincipal());
//        System.out.println(pj.getDocumentoPrincipal());
//
//        Cliente cliente = new Cliente(pj, "compras", "weber", "weber");
//
//        System.out.println(cliente.getTipoCliente());
//        System.out.println(cliente.getDocumentoPrincipalCliente());
//
//        System.out.println(cliente.getEnderecoCliente());


        //System.out.println(cliente.pessoa.getDocumentoPrincipal());

     Funcionario funcionario = new Funcionario(pf, 10 ,LocalDate.now() , "424");

     System.out.println(funcionario.getIdFuncionario());
//        System.out.println(funcionario.getNome());
//
//        Login login = new Login("weber", "203040", funcionario);
//        System.out.println(login.getSenha());

//        System.out.println(login.getFuncionario());

        Produto produto = new Produto(10, "produto", 1020, BigDecimal.valueOf(10L), "carne" ,"seara",
                10, 1, 11, 2, "kilo", new Categoria("padaria"), new Desconto("leve 4 pague 3", BigDecimal.valueOf(10L)));

        System.out.println(produto);

    }
}