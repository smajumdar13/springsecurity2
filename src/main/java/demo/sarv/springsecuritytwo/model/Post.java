package demo.sarv.springsecuritytwo.model;

import org.springframework.data.annotation.Id;

public record Post(@Id Integer id, String title, String content) {

}
