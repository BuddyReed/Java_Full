class SLNode {
    constructor(value) {
        this.value = value
        this.next = null
    }
}



class SLL {
    constructor() {
        this.head = null;
    }
    //  MONDAY -------------------------------------------------------------------//
    /**
     * Prints all the nodes in the list to the console.
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {SinglyLinkedList} This list.
     */
    isEmpty() {
        if (this.head === null) {
            return true
        }
        return false
    }
    printValues() {
        // SLL IS EMPTY
        if (this.isEmpty()) {
            console.log("SLL IS EMPTY")
        }
        // SLL IS NOT EMPTY
        let runner = this.head
        while (runner != null) {
            console.log(runner.value)
            runner = runner.next.next
        }
    }
    //  TUESDAY -------------------------------------------------------------------//
    /**
     * Creates a new node with the given data and inserts it at the back of
     * this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} data The data to be added to the new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBack(data) {
        // SLL IS EMPTY
        if (this.isEmpty()) {
            let s1Node1 = new SLNode(data);
            // CREATE A NEW NODE WITH THE GIVEN DATA
            // POINT THE HEAD TO THE NEW NODE
            this.head = NewNode
            // RETURN
            // SLL IS NOT EMPTY
            // CREATE A RUNNER AT THE HEAD
            // RUN THE RUNNER UNTIL IT GETS TO THE LAST NODE
            // CREATE A NEW NODE WITH THE GIVEN DATA
            // POINT THE RUNNER'S NEXT TO THE NEW NODE
        }
    }
    /**
     * Adds each item of the given array to the back of this list.
     * - Time: (?).
     * - Space: (?).
     * @param {Array<any>} vals The data for each new node.
     * @returns {SinglyLinkedList} This list.
     */
    seedFromArr(vals) {

    }

}

//==========================//
//         TESTING          //
//==========================//


var sll = new SLL();
// sll.insertAtBack(1)
// sll.insertAtBack(2)
// sll.insertAtBack(3)
// sll.insertAtBack(4)
// sll.insertAtBack(5)

// sll.printValues()