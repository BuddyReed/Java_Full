/**
 * Class to represent a Node in a Binary Search Tree (BST).
 */
class BSTNode {
    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// This means the Binary Tree not the Node
class BinarySearchTree {
    constructor() {
        this.root = null;
    }

    isEmpty() { 
        return this.root === null;
    }

    min(current = this.root) { 
        // BST IS EMPTY
        if(this.isEmpty()){
            return null;
        }
        // BST IS NOT EMPTY
        let runner = current;
        while(runner.left != null){
            runner = runner.left
        }
        return runner.data
    }

    minRecursive(current = this.root) { 
        // BST IS EMPTY
        if(this.isEmpty()){
            return null;
        }        
        // BASE CASE
        if(current.left === null){
            return current.data
        }
        // FORWARD PROGRESS
        // RECURSIVE CALL
        return this.minRecursive(current.left)
    }

    /**
     * Retrieves the largest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The largest integer from this tree.
     */
    max(current = this.root) { }

    /**
     * Retrieves the largest integer data from this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The largest integer from this tree.
     */
    maxRecursive(current = this.root) { }

    // Logs this tree horizontally with the root on the left.
    print(node = this.root, spaceCnt = 0, spaceIncr = 10) {
        if (!node) {
            return;
        }

        spaceCnt += spaceIncr;
        this.print(node.right, spaceCnt);

        console.log(
            " ".repeat(spaceCnt < spaceIncr ? 0 : spaceCnt - spaceIncr) +
            `${node.data}`
        );

        this.print(node.left, spaceCnt);
    }

    // ------------------- TUESDAY --------------------------//
    /**
     * Determines if this tree contains the given searchVal.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} searchVal The number to search for in the node's data.
     * @returns {boolean} Indicates if the searchVal was found.
     */
    contains(searchVal) { 
        // BST IS EMPTY
        if(this.isEmpty()){
            return false;
        }  
        // BST IS NOT EMPTY
        // SET RUNNER AT ROOT | WE WILL REFERR TO THE FUNNER WHEN CALLING ON THE BTSNODE ATTRUIBUTES
        let runner = this.root
        // while loop
        // This keeps runner, running...
        while(runner !== null){
            // searchVal is EQUAL to runner data
            if(runner.data === searchVal){
                return true;
            }
            // searchVal is LESS THAN to runner data
            if(searchVal < runner.data){
                runner = runner.left
            }
            // searchVal is GREATER THAN to runner data
            else{
                runner = runner.right 
            }
        }
        return false;
        
    }
    /**
     * Determines if this tree contains the given searchVal.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} searchVal The number to search for in the node's data.
     * @returns {boolean} Indicates if the searchVal was found.
     */
    containsRecursive(searchVal, current = this.root) { }

    /**
     * Calculates the range (max - min) from the given startNode.
     * - Time: O(?).
     * - Space: O(?).
     * @param {Node} startNode The node to start from to calculate the range.
     * @returns {number|null} The range of this tree or a sub tree depending on if the
     *    startNode is the root or not.
     */
    range(startNode = this.root) { }




    // ------------------- WEDNESDAY --------------------------//
    /**
     * Inserts a new node with the given newVal in the right place to preserver
     * the order of this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} newVal The data to be added to a new node.
     * @returns {BinarySearchTree} This tree.
     */
    insert(newVal) { 
        // CREATE A NEW BST NODE       
        let newNode = new BSTNode(newVal)
        // BST IS EMPTY
        if(this.isEmpty()){
        // POINT THE ROOT TO THE NEW BST NODE
            this.root = newNode
            // RETURN THIS
            return this
        }          
        // BST IS NOT EMPTY
        // SET THE RUNNER AT THE ROOT
        let runner = this.root
            // COMPARE THE newValue TO runner data
        while(runner != null){
            // This tells us where we need to put our new node
            // CHECK TO SEE IF THE runner LEFT or RIGHT POINTS TO ANOTHER NODE
            // IF LEFT or RIGHT points to NULL
            if(newNode.data < runner.data && runner.left === null){
                runner.left = newNode
            }
            if(newNode.data >= runner.data && runner.right === null){
                runner.right = newNode
            }
            // POINT THE runner LEFT or RIGHT to the NEW BST NODE
            if(newNode.data < runner.data){
                runner = runner.left
            }
            if(newNode.data >= runner.data){
                runner = runner.right
            }
        }
        return this
        
    }

    /**
     * Inserts a new node with the given newVal in the right place to preserver
     * the order of this tree.
     * - Time: O(?).
     * - Space: O(?).
     * @param {number} newVal The data to be added to a new node.
     * @param {Node} curr The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {BinarySearchTree} This tree.
     */
    insertRecursive(newVal, curr = this.root) { }


    // ------------------- THRUSDAY --------------------------//
    /**
     * DFS Inorder: (Left, CurrNode, Right)
     * Converts this BST into an array following Depth First Search inorder.
     * See debugger call stack to help understand the recursion.
     * Example on the fullTree var:
     * [4, 10, 12, 15, 18, 22, 24, 25, 31, 35, 44, 50, 66, 70, 90]
     * @param {Node} node The current node during the traversal of this tree.
     * @param {Array<number>} vals The data that has been visited so far.
     * @returns {Array<number>} The vals in DFS Preorder once all nodes visited.
    */
    toArrInorder(node = this.root, inOrder = []) { 
        // BASS CASE
        // FORWARD PROGRESS
        // RECURSIVE CALL
        if(node === null){
            return inOrder;
        }
        this.toArrInOrder(node.left, inOrder)
        inOrder.push(node.value);
        this.toArrInOrder(node.right, inOrder)
        
        return inOrder;
        // RECRUSIVE FUNCTION
        // CHECK TO SEE IF NODE EXISTS
            // RECURSIVE CALL TO LEFT SIDE
            // PUSH THE NODE DATA INTO ARRAY
            // RECURSIVE CALL TO RIGHT SIDE
        // RETURN ARRAY OF NUMBERS
        // CALL STACKING WHEN GOING DOWN RECUSSIVE
    }
}

// Wednesday ------------------------------------------Thursday-----------
    /* fullTree
                    root
                <-- 25 -->
              /            \
            15             50
          /    \         /    \
        10     22      35     70
      /   \   /  \    /  \   /  \
    4    12  18  24  31  44 66  90
*/

const fullTree = new BinarySearchTree();
fullTree
.insert(25)
.insert(15)
.insert(10)
.insert(22)
.insert(4)
.insert(12)
.insert(18)
.insert(24)
.insert(50)
.insert(35)
.insert(70)
.insert(31)
.insert(44)
.insert(66)
.insert(90);
// fullTree.print();
console.log(fullTree.toArrInOrder);









// const emptyTree = new BinarySearchTree();
// const oneNodeTree = new BinarySearchTree();
// oneNodeTree.root = new BSTNode(10);

// /* twoLevelTree
//         root
//         10
//       /   \
//     5     15
// */
// const twoLevelTree = new BinarySearchTree();
// twoLevelTree.root = new BSTNode(10);
// twoLevelTree.root.left = new BSTNode(5);
// twoLevelTree.root.right = new BSTNode(15);

// /* threeLevelTree 
//         root
//         10
//       /   \
//     5     15
//   / \    / \
// 2   6  13  
// */
// const threeLevelTree = new BinarySearchTree();
// threeLevelTree.root = new BSTNode(10);
// threeLevelTree.root.left = new BSTNode(5);
// threeLevelTree.root.left.left = new BSTNode(2);
// threeLevelTree.root.left.right = new BSTNode(6);
// threeLevelTree.root.right = new BSTNode(15);
// threeLevelTree.root.right.left = new BSTNode(13);

// console.log(threeLevelTree.min())
// threeLevelTree.print()

// console.log(threeLevelTree.contains(7))

