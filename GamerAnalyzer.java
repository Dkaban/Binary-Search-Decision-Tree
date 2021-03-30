//*************************************************************************************
//  GamerAnalyzer.java
//
//  AUTHOR: DUSTIN KABAN
//  ID: T00663749
//  DATE: March 18th, 2021
//  COURSE INFO: COMP 2231 ASSIGNMENT 4, QUESTION 1
//
// This class is used to display outputs to the user based on a given file containing decision tree data.
//*************************************************************************************

import java.io.*;

public class GamerAnalyzer
{
    public static void main (String[] args) throws FileNotFoundException
    {
        //Outputs and File for the more complex, Gamer tree
        System.out.println("To game or not to game, that is the question");
        DecisionTree expert = new DecisionTree("input2.txt");

        //The evaluation functions display different information to the user and allow for input.
        expert.evaluate();
        //expert.evaluateRecursive(DecisionTree.tree);
        //expert.evaluateTraversal(DecisionTree.tree.iteratorPostOrder());
        //expert.evaluateTraversal(DecisionTree.tree.iteratorPreOrder());
        //expert.evaluateTraversal(DecisionTree.tree.iteratorInOrder());
        //expert.evaluateTraversal(DecisionTree.tree.iteratorLevelOrder());
    }
}