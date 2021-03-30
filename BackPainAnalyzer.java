//*************************************************************************************
//  BackPainAnalyzer.java
//
//  AUTHOR: DUSTIN KABAN
//  DATE: March 18th, 2021
//
// This class is used to display outputs to the user based on a given file containing decision tree data.
//*************************************************************************************

import java.io.*;

public class BackPainAnalyzer
{
    public static void main (String[] args) throws FileNotFoundException
    {
        //Outputs and File for the basic, BackPainAnalyzer tree
        System.out.println ("So, you’re having back pain.");
        DecisionTree expert = new DecisionTree("input.txt");

        //The evaluation functions display different information to the user and allow for input.
        //expert.evaluate();
        //expert.evaluateRecursive(DecisionTree.tree);
        //expert.evaluateTraversal(DecisionTree.tree.iteratorPostOrder());
        expert.evaluateTraversal(DecisionTree.tree.iteratorPreOrder());
        //expert.evaluateTraversal(DecisionTree.tree.iteratorInOrder());
        //expert.evaluateTraversal(DecisionTree.tree.iteratorLevelOrder());
    }
}
