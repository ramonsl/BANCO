import java.util.Scanner;

public class Endereco {
    public  int tipo;
    public String lougradoro;
    public int numero;
    public  String complemento;
    public  String cep;
    public String cidade;
    public String estado;
    public  String pais;
    Scanner tc= new Scanner(System.in);

    public void imprimirEndereco(){

        //TODO fazer imprimir o cliente
    }

    public void cadastrarEndereco(){
        System.out.println("Digite 1 para residencial ou 2 para comercial");
        tipo=tc.nextInt();
        System.out.println("Digite o lougradoro");
        lougradoro=tc.next();
        System.out.println("Digite o  numero");
        numero=tc.nextInt();
        //TODO ler outros dados
    }
}
