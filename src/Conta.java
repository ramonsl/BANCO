import java.util.Scanner;

public class Conta {
    public Cliente cliente;
    public String numeroConta;
    public String agencia;
    public Double saldo;
    public Double chequeEspecial;
    Scanner tc = new Scanner(System.in);

    public void criarConta(){
        cliente = new Cliente();
        cliente.lerCliente();
        System.out.println("Numero da conta");
        numeroConta=tc.next();
        System.out.println("Numero da agencia");
        agencia=tc.next();
        System.out.println("Saldo inicial:");
        saldo=tc.nextDouble();
        chequeEspecial=100.0;
    }
    public boolean sacar(Double valor){
        //todo evitar depositos negativos

        if (saldo+chequeEspecial>valor){
            saldo=saldo-valor;
            System.out.println("Saque autorizado");
            System.out.println("Seu saldo é "+ saldo);
            return true;
        }else{
            System.out.println("Saque não autorizado");
            return false;
        }
    }

    public void depositar(Double valor){
        //todo evitar depositos negatifos
       saldo=saldo+valor;
        System.out.println("Deposito realizado");
        System.out.println("Seu saldo é "+ saldo);
    }
     public void tranferir(Conta conta, Double valor){
        if(sacar(valor)){
            conta.depositar(valor);
        }else {
            System.out.println("nao foi possivel");
        }
     }

     public void imprimirConta(){
         System.out.println("Conta:" +numeroConta);
         cliente.imprimirCliente();
     }


}
