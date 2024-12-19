package q1;

public class Funcionario {
    private String name;
    private double salario;
    private Setor setorAtuacao;

    public Funcionario(String nome, double salario, Setor setorAt) {
        this.name = nome;
        this.salario = salario;
        this.setorAtuacao = setorAt;
    }

    public String getName() {
        return name;
    }

    public double getSalario() {
        return salario;
    }

    public Setor getSetorAtuacao() {
        return setorAtuacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSetorAtuacao(Setor setorAtuacao) {
        this.setorAtuacao = setorAtuacao;
    }

    public void changeSetor(Setor novo) {
        this.setorAtuacao.removeFuncionario(this);
        novo.addFuncionario(this);
    }

}
