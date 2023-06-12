import java.util.Arrays;
import java.util.List;

public class ArqueiroClasse extends ClasseBasePersonagemModel {
    public ArqueiroClasse() {
        super(45, 40, "Arqueiro");

        List<String> equipamentos = Arrays.asList("ARCO");
        this.equipamentos = equipamentos;
    }
}
