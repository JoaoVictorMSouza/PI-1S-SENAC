import java.util.Arrays;
import java.util.List;

public class MagoClasse extends ClasseBasePersonagemModel { 
    public MagoClasse() {
        super(50, 50, "Mago");
        
        List<String> equipamentos = Arrays.asList("CAJADO DE MADEIRA");
        this.equipamentos = equipamentos;
    }
}
