package my.projects.sevices.triangle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by P5104488 on 8/21/2019.
 */
@RestController
@RequestMapping("/api")
public class TriangleService {

    @GetMapping("/triangle")
    public String getSquare(){
        return "Triangle";
    }
}
