package br.com.fiap.epictask.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskController {

    @GetMapping
    public String index(Model model){
        var tasks = List.of("tarefa 1", "tarefa 2", "tarefa 3");
        model.addAttribute("tasks", tasks);
        return "index";
    }
}
