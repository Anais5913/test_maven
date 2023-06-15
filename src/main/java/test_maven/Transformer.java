package test_maven;

import java.util.HashMap;

/**
 * Remplace un ensemble de token par des values prédéfinis
 * 
 * 
 * @author Administrateur
 *
 */

public class Transformer {
	

	
	private HashMap<String, String> tokenMap = new HashMap<String, String>();
	
	
	public Transformer() {
		super();
	}

	
	/**
	 * Ajoute un nouveau token qui sera utiliser par le transform
	 * 
	 * @param token On identifie les tokens sans les brackets ""
	 * @param value
	 */
	public void addToken(String token, String value) {
		if (checkToken(token)) {
			tokenMap.put(token, value);
		} else {
			System.out.println("Erreur");
		}
	}
	
	public void removeToken(String token) {
		if (checkToken(token)) {
			tokenMap.remove(token);
		} else {
			System.out.println("Erreur");
		}
	}
	
	// Pour transformer le token
	public String transform(String text) {
		for (String token : tokenMap.keySet()) {
			String value = tokenMap.get(token);
			text = text.replace(token,value);
		}
		return text;
	}
	
	// methode permettant de tchecker si le token est vide ou non. 
	private boolean checkToken(String token) {
		if (token == null || token.equals("") || token.charAt(0)!='{' || token.charAt(token.length()-1) != '}') {
			return false;
		} else {
			return true;
		}
	}

}
