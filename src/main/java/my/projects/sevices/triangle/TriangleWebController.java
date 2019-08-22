package my.projects.sevices.triangle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by P5104488 on 8/21/2019.
 */
@Controller
public class TriangleWebController {

    @GetMapping("/triangle")
    public String getSquare(@RequestParam(name="name", required=false, defaultValue="Triangle") String name, Model model) {
        model.addAttribute("name", name);
        return "triangle";
    }
}
