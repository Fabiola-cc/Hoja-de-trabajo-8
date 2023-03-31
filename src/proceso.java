
public class proceso implements Comparable<proceso> {
    private final String nombre_proceso;
    private final String usuario;
    private final int nice;
    private int priority;

    public proceso(String nombreProceso, String _usuario, int _nice) {
        nombre_proceso = nombreProceso;
        usuario = _usuario;
        nice = _nice;
        findPR(_nice);
    }

    public int findPR(int nice) {
        priority = 20 + nice + 100;
        return priority;
    }

    @Override
    public int compareTo(proceso _Process) {
        int PR_Process = _Process.getPriority();
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


    @Override
    public String toString() {
        String para_imprmir = "Nombre del proceso:  "+getNombre_proceso()+"\nNombre del usuario:  "+getUsuario()+"\nNúmero nice:  "+getNice()+"\nNúmero de prioridad:  "+getPriority() +"\n";
        return para_imprmir;
    }
    public String toString2() {
        String para_imprmir = getNombre_proceso()+","+getUsuario()+","+getNice()+",PR = "+getPriority();
        return para_imprmir;
    }
}
