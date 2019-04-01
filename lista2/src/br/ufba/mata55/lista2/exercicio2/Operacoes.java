package br.ufba.mata55.lista2.exercicio2;

import br.ufba.mata55.lista2.exercicio1.Aluno;

public class Operacoes {
    public static double media(Aluno[] alunos){
        Double totalNotas = 0.0;
        int totalAlunos = 0;
        for (Aluno aluno: alunos) {
            if(aluno.getNota() != null) {
                totalAlunos++;
                totalNotas+=aluno.getNota();
            }
        }
        return (totalNotas/totalAlunos);
    }

    public static double media(Double[] notas){
        Double totalNotas = 0.0;
        int totalAlunos = 0;
        for (Double nota: notas) {
            if(nota != null) {
                totalAlunos++;
                totalNotas+=nota;

            }
        }
        return (totalNotas/totalAlunos);
    }

    public static void main(String[] args){
        Aluno aluno1 = new Aluno("André", 5.0);
        Aluno aluno2 = new Aluno("Kevelin", 2.0);
        Aluno aluno3 = new Aluno("Outro");
        Double[] notas = {aluno1.getNota(), aluno2.getNota(), aluno3.getNota()};
        Aluno[] alunos= {aluno1, aluno2, aluno3};

        System.out.println(media(notas));
        System.out.println(media(alunos));
    }
}
