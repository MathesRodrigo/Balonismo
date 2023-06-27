public class Main {

    public static void main(String[] args) {

        Balao b1 = new Balao();
        Pessoa pessoa = new Pessoa("matheus", "23989128319", "1231" , "'12 3145411", "rua milano", "arnold");
        Piloto piloto = new Piloto();


        String resultado = b1.voar();
        System.out.println(resultado);



    }
}