import java.util.ArrayList;
import java.util.List;

public class Oraculo {
	
	public List<String> melhoresProdutos(String tipo) {
		List<String> lista = new ArrayList<>();
		if(tipo.equals("doce de leite")) {
			lista.add("Vi�osa");
			lista.add("Boreal");
		}else if(tipo.equals("queijo mineiro")){
			lista.add("C�ndido Tostes");
			lista.add("Humait�");
			lista.add("O da minha tia Tot�nia");
		}
		return lista;
	}

}
