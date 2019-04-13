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

    public static double media(double[] notas){
        double totalNotas = 0.0;
        for (double nota: notas) {
            totalNotas+=nota;
        }
        return totalNotas/notas.length;
    }

}
