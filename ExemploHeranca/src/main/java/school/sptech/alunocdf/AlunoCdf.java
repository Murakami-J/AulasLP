package school.sptech.alunocdf;

import school.sptech.Aluno;

public class AlunoCdf extends Aluno {
    /*
        Aqui estamos SOBRESCREVENDO o comportamento do método calcularMedia() dessa subclasse
     */

    @Override
    public Double calcularMedia(){
        return 10.0;
    }

    public String getMetodoCdf(){
        return "#força #foco #fé";
    }
}
