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

    //The method calls the addComment() method in the Repository and passes the comment to be persisted in the database
    public void addComment(Comment comment) {
        commentRepository.addComment(comment);
    }

    //Call the getComments() method in the Repository and obtain a List of all the comments in the database
    public List<Comment> getComments(Integer imageId) {
        return commentRepository.getComments(imageId);
    }
}
