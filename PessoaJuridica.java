package ed04;

/**
 * Representa um contato do tipo Pessoa Jurídica.
 */
public class PessoaJuridica extends ContatoBase {
    private String cnpj;

    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        setCnpj(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj == null || !cnpj.matches("\\d{14}")) {
            throw new IllegalArgumentException("CNPJ inválido. Deve conter 14 dígitos numéricos.");
        }
        this.cnpj = cnpj;
    }

    @Override
    public String getIdentificador() {
        return cnpj;
    }
}