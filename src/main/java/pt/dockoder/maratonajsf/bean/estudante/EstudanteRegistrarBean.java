package pt.dockoder.maratonajsf.bean.estudante;

import lombok.Data;
import lombok.NoArgsConstructor;
import pt.dockoder.maratonajsf.model.Estudante;

import javax.inject.Named;
import javax.persistence.Id;
import java.io.Serializable;

// gerenciado pelo CDI
@Named
@Data
@NoArgsConstructor
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante;

}
