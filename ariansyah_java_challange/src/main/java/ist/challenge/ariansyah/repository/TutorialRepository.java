package ist.challenge.ariansyah.repository;
        

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ist.challenge.ariansyah.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}