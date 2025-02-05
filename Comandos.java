
import java.util.HashMap;
import java.util.Map;

class Comandos {

    private final Map<String, Comando> comandos;

    public Comandos(Biblioteca biblioteca) {
        comandos = new HashMap<>();
        comandos.put("emp", new EmprestimoComando(biblioteca));
        comandos.put("res", new ReservaComando(biblioteca));
        comandos.put("dev", new DevolucaoComando(biblioteca));
        comandos.put("obs", new ObservadorComando(biblioteca));
        comandos.put("ntf", new NotificacoesComando(biblioteca));
        comandos.put("usu", new UsuarioComando(biblioteca));
        comandos.put("liv", new LivroComando(biblioteca));
    }

    public void executarComando(String entrada) {
        String[] partes = entrada.split(" ");
        Comando comando = comandos.get(partes[0]);
        if (comando != null) {
            comando.executar(partes);
        } else {
            System.out.println("Comando não reconhecido.");
        }
    }
}
