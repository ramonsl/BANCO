public class Banco {
    public static void main(String[] args) {

       Conta c1= new Conta();
       c1.criarConta();
       Conta c2= new Conta();
       c2.criarConta();

       c1.depositar(100.0);
       c2.sacar(1000.0);
       c1.tranferir(c2,100.0);

    }
}
