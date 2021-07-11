package pt.dockoder.maratonajsf.bean.estudante;

import lombok.Data;
import lombok.NoArgsConstructor;
import pt.dockoder.maratonajsf.model.Estudante;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

// gerenciado pelo CDI
@Named
@Data
@NoArgsConstructor
@ViewScoped //mantem o estado do objecto enquanto estiver no mesmo view
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();
    private String[] nomes = {"John", "Karl", "Mashid"} ;
    private List<String> nomesList = asList("Mary", "Lola", "Monika");
    private Set<String> nomesUnicos = new HashSet<>(asList("Maputo", "Kim", "Ebulo"));
    private Map<String, String> nomesMapeados = new HashMap<>();
    private Boolean mostrarNota;

    {
        nomesMapeados.put("Mary", "Crazy");
        nomesMapeados.put("Lola", "Princess");
        nomesMapeados.put("Monika", "Nerd");
    }

    public void executar(){
        System.out.println("Fazendo busca ao BD");
        System.out.println("A Processar os dados");
        System.out.println("A exibir os dados");
    }

    public void executar(String param){
        System.out.println("Fazendo busca ao BD com o parametro: " +  param);
        System.out.println("A Processar os dados");
        System.out.println("A exibir os dados");
    }

    public String processar(String param){
        return "A processar o parâmetro: " + param;
    }

    public String goNextPage(){
        return "index2?faces-redirect=true";
    }

    public void exibirNotas(boolean action){
        this.mostrarNota = action;
    }

}
