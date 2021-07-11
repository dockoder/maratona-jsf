package pt.dockoder.maratonajsf.bean.session;

import lombok.Data;
import lombok.Getter;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@Data
//vivo apenas durante a requisição html
//em situações onde exibimos apenas dados ao usuário
@SessionScoped
public class TesteSessionBean implements Serializable {
    @Getter
    private List<String> personagens = asList("Goku", "Vegeta", "Gohan");
    private List<String> personagemSelecionado = new ArrayList<>();

    public void selecionarPersonagem(){
        int idx = ThreadLocalRandom.current().nextInt(3);
        String persona = personagens.get(idx);
        personagemSelecionado.add(persona);
    }
}
