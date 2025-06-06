package org.example.blogplatforms.Post;

import org.example.blogplatforms.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByUser(User user);
//    List<Post> findPostById(Long userId);

    Long id(Long id);
}
