package br.com.apisimples.projeto.model.DAO;

import br.com.apisimples.projeto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {
}
