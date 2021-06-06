package br.com.geovanejunior.hrworker.repositories;

import br.com.geovanejunior.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
