/* Scrivere un programma che contenga una classe che definisce uno Studente
che abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente. */


public class Oggetti1 {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Mario", "Rossi", 12345);

        System.out.println("Lo studente è: " + studente1);


    }
}

class Studente {
    private String nome;
    private String cognome;
    private int identificativo;

    public Studente(String nome, String cognome, int identificativo) {
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + ", identificativo: " + identificativo;
    }
}