package bzh.eni.ecole.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bzh.eni.ecole.bo.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}
