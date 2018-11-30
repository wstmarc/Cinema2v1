package fr.laerce.cinema2.web;

import fr.laerce.cinema2.dao.FilmsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @Autowired
    FilmsDAO filmsDAO;

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("nom","Karl");
        model.addAttribute("films",filmsDAO.films());
        return "index";
    }

    @GetMapping("/film/{id}")
    public String detail(Model model, @PathVariable("id") String id){
        Integer idFilm = Integer.parseInt(id);
        model.addAttribute("film", filmsDAO.getById(idFilm));
        return "detail";
    }
}
