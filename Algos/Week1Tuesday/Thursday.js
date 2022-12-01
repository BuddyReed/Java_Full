// THe node
class SLNode {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

// The head creates the new list. 
class SLL {
    constructor() {
        this.head = null;
    }

    // validate if empty
    isEmpty() {
        return this.head === null;
    }

    // THURSDAY --------------------------------------------------------------------//

    /**
     * Removes the last node of this list.
     * - Time: (?).
     * - Space: (?).
     * @returns {any} The data from the node that was removed.
     */
    removeBack() {
        // SLL IS EMPTY
        if (this.head == null) {
            return this
        }
        // SLL HAS 1 NODE
        if (this.head.next == null) {
            this.head = null
            return this
        }
        // SLL IS NOT EMPTY
        let runner = this.head
        while (runner != null) {
            runner = runner.next
        }
        if (this.next.next == null) {
            runner.next = null
        }
    }
    /**
     * Determines whether or not the given search value exists in this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} val The data to search for in the nodes of this list.
     * @returns {boolean}
     */
    contains(target) {

    }
    // EXTRA
    /**
     * Determines whether or not the given search value exists in this list.
     * - Time: (?).
     * - Space: (?).
     * @param {any} val The data to search for in the nodes of this list.
     * @param {?node} current The current node during the traversal of this list
     *    or null when the end of the list has been reached.
     * @returns {boolean}
     */
    containsRecursive(val, current = this.head) {

    }