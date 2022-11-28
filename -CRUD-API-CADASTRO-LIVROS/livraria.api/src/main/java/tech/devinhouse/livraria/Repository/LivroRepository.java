package tech.devinhouse.livraria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.devinhouse.livraria.model.Livro;

public interface LivroRepository extends JpaRepository <Livro, Integer> {


}
