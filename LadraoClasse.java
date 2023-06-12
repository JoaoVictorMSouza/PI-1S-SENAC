import java.util.Arrays;
import java.util.List;

public class LadraoClasse extends ClasseBasePersonagemModel {
    public LadraoClasse() {
        super(30, 60, "Ladrão");
        
        List<String> equipamentos = Arrays.asList("ADAGA");
        this.equipamentos = equipamentos;
    }
}
