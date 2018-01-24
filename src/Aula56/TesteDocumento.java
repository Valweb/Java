package Aula56;

/**
 * Created by Valéria on 24/01/2018.
 */
public class TesteDocumento {

    public static void main(String[] args){

        //Exemplo de teste que gera através do método values, para obter todos  valores aleatórios para cfp e cnpj.
        /*for (TipoDocumento doc: TipoDocumento.values ()){
            System.out.println (doc + " - " + doc.geraNumeroTeste ());
        }*/

        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
        System.out.println(pf);

        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
        System.out.println(pj);

    }
}
