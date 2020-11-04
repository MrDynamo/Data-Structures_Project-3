package com.github.mrdynamo.Project_3;

public class Game extends BinaryTreeBasis<String> implements GameTree {
    TreeNode<String> curr;

    public Game() {
        // Creates empty GameTree and initializes with super constructor
        super();
    }

    // Start game - implement
    @Override
    public void startGame(String question, String yesAnswer, String noAnswer) {
        setRootItem(question);
        TreeNode<String> noMove1 = new TreeNode<>("No");
        TreeNode<String> yesMove1 = new TreeNode<>("Yes");
        root.leftChild = yesMove1;
        root.rightChild = noMove1;
        curr = root;
    }

    // New round - implement
    @Override
    public void newRound() {
        // If tree exists, reset current node to root node
        if (!this.isEmpty())
            curr = root;
        else
            throw new TreeException("TreeException: Root tree is empty or does not exist!");
    }

    // End game - implement
    @Override
    public void endGame() {
        System.out.println("Game has ended.\n\tThanks for playing!");
    }

    // Move yes - implement
    @Override
    public void moveYes() throws TreeException {
        if (curr.leftChild != null) {
            //curr = curr.leftChild;
        }
    }

    // Move no - implement
    @Override
    public void moveNo() throws TreeException {
        if (curr.leftChild != null) {
            //curr = curr.rightChild;
        }
    }

    // Get question - implement
    @Override
    public String getQuestion() throws TreeException {
        return curr.item;
    }

    // Set question - implement
    @Override
    public void setQuestion(String question, String answer) {

    }

    // Get answer - implement
    @Override
    public String getAnswer() throws TreeException {
        if (curr == null)
            throw new TreeException("TreeException: No node for current answer!");
        else
            return curr.item;
    }

    // Is question? - implement
    @Override
    public boolean isQuestion() {
        return false;
    }

    @Override
    public void setRootItem(String newItem) {
        try {
            root = new TreeNode<>(newItem);
        } catch (UnsupportedOperationException e) {
            // Throw error
        }
    }
}
