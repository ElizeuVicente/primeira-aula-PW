package school.sptech.primeiraaula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Meta Progrmação/Informação/Dados
@RestController
@RequestMapping("/frases")
public class FraseController    {
    /*
        Controlador é responsavel por um recurso lida diretamente com req. e resp
        Nem tudo em uma controller é endpoint
        recurso = objeto sistemico.
        endpoint(rota = js) = canal de comunicação com a web para um determinado recurso
    */

    @GetMapping("/bom-dia/{nome}")
    public String helloSpring(@PathVariable String nome){
        return "Bom dia, %s<br> Dormiu bem?".formatted(nome);
    }

    @GetMapping("/boa-noite/{nome}")
    public String helloSpring2(@PathVariable String nome) {
        return "Boa noite, %s<br> Durma bem e bons sonhos".formatted(nome);
    }

}
