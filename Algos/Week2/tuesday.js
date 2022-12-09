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

class BinarySearchTree {
    constructor() {
        this.root = null;
    }

    isEmpty() { 
        return this.root === null;
    }
}







// THIS IS THE ONE SIDE OF THE ONE TO MANY CODE 

// (SETTING UP THE ONE TO MANY 
// ON THE MODEL THIS IS CONSIDERED THE ONE SIDE) 
@OnetoMany(mappedBy="creator", fetch = FetchType.LAZY)
private LIST<Dish> dishes;

// The mappedBy needs to match the private Chef creator;

// _____________________________________________________

// THIS IS THE MANY SIDE OF THE MANY TO MANY CODE 

// Setting up the model on the many  side 
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="chef_id")
private Chef creator;