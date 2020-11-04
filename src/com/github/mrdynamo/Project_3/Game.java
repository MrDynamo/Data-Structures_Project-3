package com.github.mrdynamo.Project_3;

public class Game extends BinaryTreeBasis<T> implements GameTree {
    TreeNode<String> qRoot, yesRoot, noRoot, curr;

    // Start game - implement
    @Override
    public void startGame(String question, String yesAnswer, String noAnswer) {
        qRoot = new TreeNode<>(question);
        yesRoot = new TreeNode<>(yesAnswer);
        noRoot = new TreeNode<>(noAnswer);
        qRoot.leftChild = yesRoot;
        qRoot.rightChild = noRoot;
        curr = qRoot;
    }

    // New round - implement
    @Override
    public void newRound() {
        // if game tree exists
        //if () {

        //}

    }

    // End game - implement
    @Override
    public void endGame() {

    }

    // Move yes - implement
    @Override
    public void moveYes() throws TreeException {

    }

    // Move no - implement
    @Override
    public void moveNo() throws TreeException {

    }

    // Get question - implement
    @Override
    public String getQuestion() throws TreeException {
        return null;
    }

    // Set question - implement
    @Override
    public void setQuestion(String question, String answer) {

    }

    // Get answer - implement
    @Override
    public String getAnswer() throws TreeException {
        return null;
    }

    // Is question? - implement
    @Override
    public boolean isQuestion() {
        return false;
    }

    @Override
    public void setRootItem(T newItem) {
        try {
            //qRoot.item = newItem;
            //root.item = newItem;
        } catch (UnsupportedOperationException e) {
            // Throw error
        }
    }
}
