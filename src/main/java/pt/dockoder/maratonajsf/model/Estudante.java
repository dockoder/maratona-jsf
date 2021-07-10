package pt.dockoder.maratonajsf.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import pt.dockoder.maratonajsf.enums.Turno;

@Data
@NoArgsConstructor
public class Estudante {
    private String nome = "Estudante";
    private String sobrenome = "Milenar";
    private double nota1 = 0.5;
    private double nota2;
    private double nota3 = 10;
    private Turno turno = Turno.MATUTINO;
}
