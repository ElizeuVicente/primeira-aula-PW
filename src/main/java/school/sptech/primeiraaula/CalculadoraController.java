package school.sptech.primeiraaula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculos")
public class CalculadoraController {

    private Integer contador = 0;

    @GetMapping("/somar/{num1}/{num2}")
    public Integer calcular(
            @PathVariable Integer num1,
            @PathVariable Integer num2
    ){
        return num1+num2;
    }

    @GetMapping("/contar")
    public Integer contar(){
        return ++this.contador;
    }
}
