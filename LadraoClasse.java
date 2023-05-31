import java.util.Arrays;
import java.util.List;

public class LadraoClasse extends ClasseBasePersonagemModel {
    public LadraoClasse() {
        super(30, 50, "Ladrão");
        
        List<String> equipamentos = Arrays.asList("ADAGA");
        this.equipamentos = equipamentos;
    }
}
