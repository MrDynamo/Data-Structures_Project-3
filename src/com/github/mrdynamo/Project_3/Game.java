package com.github.mrdynamo.Project_3;

public class Game extends BinaryTreeBasis<String> implements GameTree {
    private TreeNode<String> curr;
    private String yesAns, noAns;

    public Game() {
        // Creates empty GameTree and initializes with super constructor
        super();
    }

    // Start game - implement
    @Override
    public void startGame(String question, String yesAnswer, String noAnswer) {
        setRootItem(question);
        TreeNode<String> rightNode = new TreeNode<>(noAnswer);
        TreeNode<String> leftNode = new TreeNode<>(yesAnswer);
        root.leftChild = leftNode;
        root.rightChild = rightNode;
        curr = root;
        yesAns = yesAnswer;
        noAns = noAnswer;
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
        //this.makeEmpty();
        System.out.println("Game has ended.\n\tThanks for playing!");
    }

    // Move yes - implement
    @Override
    public void moveYes() throws TreeException {
        if (curr.leftChild != null) {
            curr = curr.leftChild;
        }
    }

    // Move no - implement
    @Override
    public void moveNo() throws TreeException {
        if (curr.leftChild != null) {
            curr = curr.rightChild;
        }
    }

    // Get question - implement
    @Override
    public String getQuestion() throws TreeException {
        if (curr == null)
            throw new TreeException("TreeException: No node for current answer!");
        else
            return curr.item;
    }

    // Set question - implement
    @Override
    public void setQuestion(String question, String answer) {
        TreeNode<String> tmp = curr;
        TreeNode<String> newNode = new TreeNode<>(question);
        curr = newNode;
        newNode.rightChild = tmp;
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
        return curr.rightChild != null && curr.leftChild != null;
        /*
        if (curr.item.contains("?"))
            return true;
        else
            return false;

         */
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
