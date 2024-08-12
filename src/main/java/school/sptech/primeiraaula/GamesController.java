package school.sptech.primeiraaula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GamesController {

    @GetMapping("/favorito")
    public List<Game> getfavorito(){
        Produtora fromSoftware = new Produtora("FromSoftware", "Naotoshi Zin", "Japão");
        Game gameFavorito1 = new Game("Elden Ring", fromSoftware, 5.0);
        Game gameFavorito2 = new Game("Sekiro", fromSoftware, 6.0);
        return List.of(gameFavorito2, gameFavorito1);
    }
}
