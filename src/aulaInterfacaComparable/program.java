package aulaInterfacaComparable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Employee;
import entities.Product;

//aula 234
public class program {

	public static void main(String[] args) {
	 List<Product> list= new ArrayList<>();
	 String path ="C:\\Users\\User\\Documents\\RAFAEL GOMES\\FACULDADE ENG\\curso JAVA\\in.txt";
	 list.add(new Product("tv", 900.00)); 
	 list.add(new Product("mouse", 50.00));
	 list.add(new Product("tablet", 350.50));
	 list.add(new Product("hd case", 80.90));
	 Predicate<Product> pred = p ->p.getPrice() >=100;
	 list.removeIf(pred);
	 
	 for(Product p:list) {
		 System.out.println(p);
	 }
 
	
	 
	 

	}

}
