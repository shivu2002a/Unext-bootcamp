package Collection.ListAssignment;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ScoreAnalyzer {
    private List<Integer> runsData;

    ScoreAnalyzer() {
        runsData = new LinkedList<>();
    }

    public static void main(String[] args) {
        ScoreAnalyzer scoreAnalyzer = new ScoreAnalyzer();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the count of runs: ");
        int n = s.nextInt();
        System.out.println("Enter the runs scored: ");
        int runs[] = new int[n];
        for (int i = 0; i < runs.length; i++) {
            runs[i] = s.nextInt();
        }
        scoreAnalyzer.addRunsToList(runs);
        System.out.println(scoreAnalyzer.calcRunRate());
        System.out.println(scoreAnalyzer.lowestRunsScored());
        System.out.println("Count of players who batted: " + scoreAnalyzer.runsData.size()) ;
        s.close();
    }


    private void addRunsToList(int[] runs) {
        for(int a : runs) runsData.add(a);
    }


    private double calcRunRate() {
        double sum = runsData.stream().mapToInt(Integer::intValue).sum();
        return sum / 50; 
    }


    private int lowestRunsScored() {
        return runsData.stream().min(Integer::compare).get();
    }


}
