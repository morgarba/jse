package m03.s04.ex;

public class Exercise {
	final static int GAP = 'a' - 'A';
	final static int ALPHABET_SIZE = 26;

	/**
	 * A simpler version of String.toUpperCase()
	 * 
	 * @param s
	 * @return uppercase version of input
	 */
	public String toUpper(String s) {
		StringBuilder st = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a') {
				c = (char) (c - GAP);
			}
			st.append(c);
		}
		return st.toString();
	}

	/**
	 * Encrypt an uppercase string using the Caesar's algorithm
	 * 
	 * @param s     a string (uppercase only)
	 * @param shift encrypting key
	 * @return
	 */
	public String caesarEncrypt(String s, int shift) {
		StringBuilder gc = new StringBuilder();
		if (s == null || s.isBlank()) {
			return s;
		}
		shift = shift % ALPHABET_SIZE; // per i giri che si devono fare se shift >>26 (prendo il resto)
		for (int i = 0; i < s.length(); i++) {
			char c = (s.charAt(i)); // assegno a c il valore dei singoli caratteri nella stringa
			if ((c + shift) > 'Z') { // quando buco l'ascii di z faccop
				c = (char) ((shift - ('Z' - c) - 1) + 'A'); // differenza tra c e z, tolto a shift e al passaggio tra z
															// e a e sommato ad a
			} else if ((c + shift) < 'A') { // se buco da sotto
				c = (char) ('Z' - ((c - 'A') + shift + 1)); // come prima ma inverso
			} else
				c = (char) (c + shift); // se entrambe le condizioni precedenti non valgono, assegno normalmente
			gc.append(c);
		}
		return gc.toString();

	}
}
