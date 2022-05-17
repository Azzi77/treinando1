public class TestePessoa {

    public static void main(String[] args) {

        Pessoa  pessoa  = new Pessoa();

        pessoa.setNome("Regina");
        pessoa.setEndereço("Rua Santos Dumont");
        pessoa.setTelefone("14-99840-1897");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getEndereço());
        System.out.println(pessoa.getTelefone());


    }
}
