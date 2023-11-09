package com.multi.mvc01.MovieGenreController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenreController {

    @RequestMapping("movie")
    public String movie(String movie) {

        System.out.println(movie);
        String filename = "redirect:movie.jsp";

        if (movie.equals("comedy")) {
          filename = "comedy";
        } else if (movie.equals("action")) {
           filename = "action";
        } else if (movie.equals("drama")) {
            filename = "drama";
        } else {
            return "no";
        }
        return filename;
    }
}
