package ed04;

import java.util.ArrayList;
import java.util.List;

/**
 * Controlador responsável por gerenciar os contatos.
 */
public class ContatoController {
    private List<ContatoBase> contatos = new ArrayList<>();

    public void adicionar(ContatoBase contato) {
        for (ContatoBase c : contatos) {
            if (c.getIdentificador().equals(contato.getIdentificador())) {
                throw new IllegalArgumentException("Contato com mesmo CPF/CNPJ já existe.");
            }
        }
        contatos.add(contato);
    }

    public void remover(String identificador) {
        contatos.removeIf(c -> c.getIdentificador().equals(identificador));
    }

    public List<ContatoBase> listar() {
        return contatos;
    }
}