package Aula56;

/**
 * Created by Valéria on 24/01/2018.
 */
public enum TipoDocumento {
    CPF {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cpf ();
        }
    }, CNPJ {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cnpj ();
        }
    };
public abstract String geraNumeroTeste();

}
