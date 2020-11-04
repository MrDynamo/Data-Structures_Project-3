// TreeNode.java

package com.github.mrdynamo.Project_3;

class TreeNode<T> {
  T item; // Question
  TreeNode<?> leftChild; // Yes answer
  TreeNode<T> rightChild; // No answer

  public TreeNode(T newItem) {
  // Initializes tree node with item and no children.
    item = newItem;
    leftChild  = null;
    rightChild = null;
  }  // end constructor

  public TreeNode(T newItem,
                  TreeNode<T> left, TreeNode<T> right) {
  // Initializes tree node with item and
  // the left and right children references.
    item = newItem;
    leftChild  = left;
    rightChild = right;
  }  // end constructor

}  // end TreeNode