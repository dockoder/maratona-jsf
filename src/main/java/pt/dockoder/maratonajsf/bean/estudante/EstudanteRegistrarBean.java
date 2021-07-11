package pt.dockoder.maratonajsf.bean.estudante;

import lombok.Data;
import lombok.NoArgsConstructor;
import pt.dockoder.maratonajsf.model.Estudante;

import javax.inject.Named;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

// gerenciado pelo CDI
@Named
@Data
@NoArgsConstructor
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();
    private String[] nomes = {"John", "Karl", "Mashid"} ;
    private List<String> nomesList = asList("Mary", "Lola", "Monika");
    private Set<String> nomesUnicos = new HashSet<>(asList("Maputo", "Kim", "Ebulo"));
    private Map<String, String> nomesMapeados = new HashMap<>();

    {
        nomesMapeados.put("Mary", "Crazy");
        nomesMapeados.put("Lola", "Princess");
        nomesMapeados.put("Monika", "Nerd");
    }

}
