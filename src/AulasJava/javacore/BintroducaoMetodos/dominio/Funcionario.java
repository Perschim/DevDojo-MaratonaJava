package AulasJava.javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    private String nome = null;
    private int idade = 0;
    private double[] salarios = null;
    private double media = 0;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
            return;
        }


        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("media salarial = " + media);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;

    }
}
