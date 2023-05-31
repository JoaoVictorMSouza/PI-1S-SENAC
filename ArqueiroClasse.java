import java.util.Arrays;
import java.util.List;

public class ArqueiroClasse extends ClasseBasePersonagemModel {
    public ArqueiroClasse() {
        super(40, 30, "Arqueiro");

        List<String> equipamentos = Arrays.asList("ARCO");
        this.equipamentos = equipamentos;
    }
}
