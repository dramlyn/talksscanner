package ru.smartup.talksscanner.repos;

import org.springframework.data.repository.CrudRepository;
import ru.smartup.talksscanner.domain.IdeaComment;
import ru.smartup.talksscanner.domain.User;

import java.util.Optional;

public interface IdeaCommentRepo extends CrudRepository<IdeaComment, Long> {
    Optional<IdeaComment> findByIdAndUserAndIdeaId(long id, User user, long ideaId);
}
