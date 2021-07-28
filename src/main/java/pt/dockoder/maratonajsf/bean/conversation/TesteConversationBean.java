package pt.dockoder.maratonajsf.bean.conversation;

import lombok.Data;
import lombok.Getter;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@Data
@ConversationScoped
public class TesteConversationBean implements Serializable {
    @Getter
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();

    @Inject
    private Conversation conversation;

    //@PostConstruct
    public void init(){
        personagens = asList("Einstein", "Hubble", "Segan");
        System.out.println("Entrou no PostConstruct do ConversationScoped");
        if (conversation.isTransient()){
            conversation.begin();
            System.out.println("Iniciar conversation scoped, ID="
             + conversation.getId());
        }
    }

    public String endConversation(){
        if (!conversation.isTransient())
                conversation.end();
        return "conversation?faces-redirect=true";
    }

    public void selecionarPersonagem(){
        int idx = ThreadLocalRandom.current().nextInt(3);
        String persona = personagens.get(idx);
        personagemSelecionado.add(persona);
    }
}
