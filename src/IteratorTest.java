import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	List<String> lista;
	List<Usuario> list;
	static List<Usuario> listaAtualizada;

	public static void main(String[] args) {

		IteratorTest test = new IteratorTest();
		// test.listarComFor();
		// test.listarComForeach();

		listaAtualizada = test.remover("Jose");
		for (Usuario user : listaAtualizada) {
			System.out.println(user.getNome());
		}
		
	}

	public IteratorTest() {

		lista = new ArrayList<String>(); // para inserir e buscar itens
		lista.add("Pedro");
		lista.add("João");
		lista.add("Maria");
		lista.add("Marcos");
		lista.add("Anna");
		lista.add("Jose");
		lista.add("Pedro");

		list = new ArrayList<Usuario>();
		Usuario jose = new Usuario(10, "Jose", "123");
		Usuario maria = new Usuario(2, "Maria", "123");
		Usuario pedro = new Usuario(5, "Pedro", "123");
		list.add(jose);
		list.add(maria);
		list.add(pedro);

	}

	// interessante para pesquisar em arrays primitivos, por exemplo
	public void listarComFor() {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista);
		}
	}

	// interessante para realizar pesquisas, por exemplo.
	public void listarComForeach() {
		for (String string : lista) {
			System.out.println(string);
		}
	}

	// interessante quando é necessário realizar atualizações e exclusões durante a
	// iteração

		
	public List<Usuario> remover(String nome) {
		Iterator<Usuario> iterator = list.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if (usuario.getNome() == nome) {
				iterator.remove();
			}
		}
		return list;
	}

}
