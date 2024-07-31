import java.util.ArrayList;
import java.util.List;

public class ControllerProduto {
	
 private static List<Produto> Listaproduto = new ArrayList<>();
 
 private static int numeroId = 1; 
 
 private int unidadeCompra = 0;    
 
 static {
	 //Rafael Henrique CB3012085
	 Produto produto1 =  new Produto();
	 produto1.setId(numeroId++);
	 produto1.setNome("tomate");
	 produto1.setDescricao("Tomate-pêra");
	 
	 Produto produto2 = new Produto();
	 produto2.setId(numeroId++);
	 produto2.setNome("maça");
	 produto2.setDescricao("maça-verde fresca");
	 
	 Produto produto3 = new Produto();
	 produto3.setId(numeroId++);
	 produto3.setNome("Café");
	 produto3.setDescricao("Cafe extraforte");
	 
	 Listaproduto.add(produto1);
	 Listaproduto.add(produto2);
	 Listaproduto.add(produto3);
  }
 
 public List<Produto> getProduto(){
	 return ControllerProduto.Listaproduto;
   }
 
 public Produto buscaProduto(String nome) {
	  for (Produto pro : Listaproduto) {
		 if(pro.getNome() == nome) {
			 return pro;
		 }  
	   }
	return null;
	   
   }
 }
