package com.testing.spring_security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.testing.spring_security.models.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByOwnerUsername(String ownerUsername);
}
