package test_maven;

public class Main {

	public static void main(String[] args) {
		
		Transformer georgeTransformer = new Transformer();
		
		String test = "Bonjour, Je m'appelle {name}, j'habite au {address}, mon numéro est {phone} et ma compagnie est {company}";
		
		georgeTransformer.addToken("{name}", "Georges");
		georgeTransformer.addToken("{address}", "11 rue du pain");
		georgeTransformer.addToken("{phone}", "07 51 24 68 98");
		georgeTransformer.addToken("{company}", "LaBoucherieDeGeorgie");
		
		System.out.println(georgeTransformer.transform(test));

	}

}
