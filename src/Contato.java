import java.util.Scanner;

public class Contato {
    public String descricao;
    public String telefone;
    public int tipo;
    Scanner tc= new Scanner(System.in);

    public void imprimirContato(){
        System.out.println("Descrição: "+descricao);
        System.out.println("Telefone: "+telefone);
        if (tipo==1){
            System.out.println("Residencial");
        }else{
            System.out.println("Comercial");
        }
    }
    public void cadastrarContato(){
        System.out.println("Digite a descricao do telefone");
        descricao=tc.next();
        System.out.println("Digite o Telefone");
        telefone=tc.next();
        System.out.println("Digite 1 para residencial ou 2 para comercial");
        tipo=tc.nextInt();
    }
}
