/* 
Intro to Singly Linked Lists
- OOP
- Array VS SLL
*/
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

    /**
     * Removes the node that has the matching given val as it's data.
     * - Time: (?).
     * - Space: (?).
     * @param {any} val The value to compare to the node's data to find the
     *    node to be removed.
     * @returns {boolean} Indicates if a node was removed or not.
     */
    removeVal(val) {
        // THE NODE TO REMOVE IS NOT THERE
        
        // THE NODE TO REMOVE IS THE FIRST NODE
        if(this.head.value == val){
            this.head = this.head.next
            return this
        }
        // THE NODE TO REMOVE IS SOMEWHERE IN THE MIDDLE
        let runner = this.head
        while(runner.next != null){
            if (runner.value == val ){
                runner.next = runner.next.next
                return this
            }
            runner = runner.next
        }
        // THE NODE TO REMOVE IS THE LAST NODE

    }

    /**
     * Retrieves the data of the second to last node in this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data of the second to last node or null if there is no
     *    second to last node.
     */
    secondToLast() {

    }

    //  FRIDAY EXTRA
    /**
     * Retrieves the data of the kth to last node in this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data of the kth to last node or null if there is no
     *    kth to last node.
     */
    kthToLast(k) {

    }
}