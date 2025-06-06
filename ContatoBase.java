package ed04;

/**
 * Classe abstrata base para contatos, contendo atributos comuns.
 */
public abstract class ContatoBase implements Contato {
    private String nome;
    private String telefone;
    private String email;

    public ContatoBase(String nome, String telefone, String email) {
        setNome(nome);
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.length() < 3) {
            throw new IllegalArgumentException("Nome deve conter pelo menos 3 caracteres.");
        }
        this.nome = nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String getIdentificador();
}