package demo.sarv.springsecuritytwo.controller;

import demo.sarv.springsecuritytwo.model.Post;
import demo.sarv.springsecuritytwo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostRepository repository;

    @Autowired
    public PostController(PostRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Post> findAll() {
        return repository.findAll();
    }
}
