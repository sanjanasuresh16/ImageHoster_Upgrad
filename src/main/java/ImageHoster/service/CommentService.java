package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllCommentsForImage(Integer imageId) {
        return commentRepository.getAllCommentsForImage(imageId);
    }

    public Comment createOrUpdateComment(Comment comment){
        return commentRepository.createOrUpdateComment(comment);
    }
}
