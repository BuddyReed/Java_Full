
class SLNode {
  constructor(value) { 
    this.value = value
    this.next = null
  }
}

// The head start SLL SinglyLinkedList
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
      runner = runner.next
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
    let runner = this.head;
    
    // Making a new Node
    if (this.isEmpty()) {
      let slNode1 = new SLNode(data);
      this.head = slNode1;
    }
    // 
    else {
      while (runner.next != null) {
        runner = runner.next;
      }
      let SLNode2 = new SLNode(data);
      runner.next = SLNode2;
      // SLL IS EMPTY
      // CREATE A NEW NODE WITH THE GIVEN DATA
      // POINT THE HEAD TO THE NEW NODE
      // RETURN
      // SLL IS NOT EMPTY
      // CREATE A RUNNER AT THE HEAD
      // RUN THE RUNNER UNTIL IT GETS TO THE LAST NODE
      // CREATE A NEW NODE WITH THE GIVEN DATA
      // POINT THE RUNNER'S NEXT TO THE NEW NODE
    }
    /**
     * Adds each item of the given array to the back of this list.
     * - Time: (?).
     * - Space: (?).
     * @param {Array<any>} vals The data for each new node.
     * @returns {SinglyLinkedList} This list.
     */
    // seedFromArr(vals) {
    // }
  }
    // WEDNESDAY -------------------------------------------------------------------//
    /**
     * Creates a new node with the given data and inserts that node at the front
     * of this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} data The data for the new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtFront(data) {
// adds node to from of SLL
    insertFromFront(data){
      let newNode = new SLNode(data);
      // SLL IS EMPTY
      if (this.isEmpty()){
          this.head = newNode;
          return this
      }
      // SLL IS NOT EMPTY
      // THis updates the SLL
      newNode.next = this.head;
      // This update the node 
      this.head = newNode;
      return this
  }
      // SLL IS EMPTY
          // CREATE A NEW NODE WITH THE GIVEN DATA
          // POINT THE HEAD TO THE NEW NODE
          // RETURN
      // SLL IS NOT EMPTY
          // CREATE A NEW NODE WITH THE GIVEN DATA
          // SET THE NEW NODE NEXT TO THE HEAD
          // POINT HEAD TO NEW NODE
  }
  /**
   * Removes the first node of this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {any} The data from the removed node.
   */
  removeAtFront() {
      // SLL IS EMPTY
          // DO NOTHING, NOTHING TO REMOVE
      // SLL IS NOT EMPTY
          // MOVE HEAD TO NEXT NODE
  }
  // EXTRA
  /**
   * Calculates the average of this list.
   * - Time: (?).
   * - Space: (?).
   * @returns {number|NaN} The average of the node's data.
   */
  average() {

  }


}
//==========================//
//         TESTING          //
//==========================//


var sll = new SLL();
sll.insertAtBack(1)
sll.insertAtBack(2)
sll.insertAtBack(3)
sll.insertAtBack(4)
sll.insertAtBack(5)

sll.printValues()