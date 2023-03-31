
public class proceso implements Comparable<Integer> {
    private String nombre_proceso;
    private String usuario;
    private int nice;
    private int priority;

    public proceso(String nombreProceso, String _usuario, int _nice) {
        nombre_proceso = nombreProceso;
        usuario = _usuario;
        nice = _nice;
        findPR(_nice);
    }

    public int findPR(int nice) {
        priority = 20 + nice;
        return priority;
    }

    @Override
    public int compareTo(Integer PR_Process) {
        if (priority < PR_Process) {
            return -1;
        } else if (priority == PR_Process) {
            return 0;
        } else {
            return 1;
        }
    }

    public String getNombre_proceso() {
        return nombre_proceso;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getNice() {
        return nice;
    }

    public int getPriority() {
        return priority;
    }
}
