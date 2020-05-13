package exercicio8.eng2020_1_a08.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import exercicio8.eng2020_1_a08.model.Previsao;


public interface PrevisoesRepository extends JpaRepository<Previsao, Long> {

}