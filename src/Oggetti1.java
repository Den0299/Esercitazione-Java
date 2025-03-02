/* Scrivere un programma che contenga una classe che definisce uno Studentee
che abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studentee. */


public class Oggetti1 {
    public static void main(String[] args) {
        Studentee Studentee1 = new Studentee("Mario", "Rossi", 12345);

        System.out.println("Lo Studentee è: " + Studentee1);


    }
}

class Studentee {
    private String nome;
    private String cognome;
    private int identificativo;

    public Studentee(String nome, String cognome, int identificativo) {
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