/*
 * Esta clase permite tener registro de variedad de procesos y prioridades, incluyendo su nombre, quien lo ha creado y la prioridad que tendrán
 */
public class proceso implements Comparable<proceso> {
    private final String nombre_proceso;
    private final String usuario;
    private final int nice;
    private int priority;

    /**
     * @param nombreProceso
     * @param _usuario
     * @param _nice
     */
    public proceso(String nombreProceso, String _usuario, int _nice) {
        nombre_proceso = nombreProceso;
        usuario = _usuario;
        nice = _nice;
        findPR(_nice);
    }

    /**
     * Hace los cálculos debidos para darle prioridad al proceso
     * 
     * @param nice
     * @return valor de prioridad
     */
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

    /**
     * @return nombre del proceso
     */
    public String getNombre_proceso() {
        return nombre_proceso;
    }

    /**
     * @return nombre de usuario que creo el proceso
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @return valor de nice establecido
     */
    public int getNice() {
        return nice;
    }

    /**
     * @return valor de prioridad calculado
     */
    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        String para_imprmir = "Nombre del proceso:  " + getNombre_proceso() + "\nNombre del usuario:  " + getUsuario()
                + "\nNúmero nice:  " + getNice() + "\nNúmero de prioridad:  " + getPriority() + "\n";
        return para_imprmir;
    }

    /**
     * Método para establecer un formato de impresión similar al que fue recibido al
     * recibir los datos del programa
     * 
     * @return
     */
    public String toString2() {
        String para_imprmir = getNombre_proceso() + "," + getUsuario() + "," + getNice() + ",PR = " + getPriority();
        return para_imprmir;
    }
}
