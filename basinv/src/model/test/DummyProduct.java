/**
 * 
 */
package model.test;
import persistency.controller.NumberController;
import model.Product;

/**
 * @author Mathy
 *
 */
public class DummyProduct extends Dummy {
	
	private static String[] product = { "Consultancy", "Business Analyse", "Project management", "Ontwikkeling", "Technische Analyse", "Training" };
	private static String[] category = { "A", "B", "C", "D", "E", "F" };
	private static String[] type = { "M", "W", "S" };
	
	/**
	 * @return
	 */
	public static Product createProduct(){
		getRandom().nextInt(product.length);
		return new Product(//new java.rmi.dgc.VMID().toString(), 
				//Integer.toHexString(DummyNumber.getNewNumber()),	//idProd   | char(15)
				//Integer.toHexString(DummyNumber.getNewNumber()),	//ProdCode | char(15)
				NumberController.readLastNumber("Prd", 0).toString(),
				"Prod"+NumberController.readLastNumber("Prd", 0).toString(),
				product[getRandom().nextInt(product.length)],	//ProdDesc | char(30)
				category[getRandom().nextInt(category.length)],	//ProdCat  | char(5)
				type[getRandom().nextInt(type.length)],	//ProdType | char(5)
				true	//Active   | tinyint(1)		
		)
		;
	}
}
