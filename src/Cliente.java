import java.util.Scanner;

public class Cliente {
    public String nome;
    public String cpf;
    public Contato[] contatos;
    public Endereco[] enderecos;


    public  void imprimirContatos(){
        for (int i=0;i<contatos.length-1;i++){
            contatos[i].imprimirContato();
        }
    }
    public void imprimirEnderecos(){
        for (int i=0;i<enderecos.length-1;i++){
            enderecos[i].imprimirEndereco();
        }
    }

    public void  imprimirCliente(){
        System.out.println("Cliente: "+nome);
        System.out.println("Cpf: "+cpf);
        imprimirContatos();
        imprimirEnderecos();

    }

    public void lerCliente(){
        Scanner tc= new Scanner(System.in);
        System.out.println("Digite o nome");
        nome=tc.next();
        System.out.println("Digite o cpf");
        cpf=tc.next();
        contatos= new Contato[3];
        enderecos= new Endereco[3];
        int op=0;
        int cont=0;
        do {
            Contato contato= new Contato();
            contato.cadastrarContato();
            contatos[cont]=contato;
            cont++;
        }while (cont<2);

        cont=0;
        do {
            Endereco endereco= new Endereco();
            endereco.cadastrarEndereco();
            enderecos[cont]=endereco;
            cont++;
        }while (cont<2);

    }

}
