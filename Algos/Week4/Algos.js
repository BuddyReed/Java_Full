/**
 * Class to represent a stack using an array to store the stacked items.
 * Follows a LIFO (Last In First Out) order where new items are stacked on
 * top (back of array) and removed items are removed from the top / back.
 */
class Stack {
    /**
     * The constructor is executed when instantiating a new Stack() to construct
     * a new instance.
     * @returns {Stack} This new Stack instance is returned without having to
     *    explicitly write 'return' (implicit return).
     */
    constructor() {
        this.items = [];
    }

    /**
     * Adds a new given item to the top / back of this stack.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @param {any} item The new item to be added to the top / back.
     * @returns {number} The new length of this stack.
     */
    push(item) {
        return this.item.push(item)
    }

    /**
     * Removes the top / last item from this stack.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {any} The removed item or undefined if this stack was empty.
     */
    pop() {
        this.item.pop()
    }

    /**
     * Retrieves the top / last item from this stack without removing it.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {any} The top / last item of this stack.
     */
    peek() {
        return this.items.at(-1) // last item
    }

    /**
     * Returns whether or not this stack is empty.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {boolean}
     */
    isEmpty() {
        return this.items.length === 0;
    }

    /**
     * Returns the size of this stack.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {number} The length.
     */
    size() {
        return this.items.length;
    }
}
/**
 * Class to represent a queue using an array to store the queued items.
 * Follows a FIFO (First In First Out) order where new items are added to the
 * back and items are removed from the front.
 */
class Queue {
    constructor() {
        this.items = [];
    }

    /**
     * Adds a new given item to the back of this queue.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @param {any} item The new item to add to the back.
     * @returns {number} The new size of this queue.
     */
    enqueue(item) {
        // This pushes to the end
        return this.items.push(3)
    }

    /**
     * Removes and returns the first item of this queue.
     * - Time: O(n) linear, due to having to shift all the remaining items to
     *    the left after removing first elem.
     * - Space: O(1) constant.
     * @returns {any} The first item or undefined if empty.
     */
    dequeue() {
        let firstElement = items.shift()
        return firstElement

    }

    /**
     * Retrieves the first item without removing it.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {any} The first item or undefined if empty.
     */
    front() {
        return this.item[0]
    }

    /**
     * Returns whether or not this queue is empty.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {boolean}
     */
    isEmpty() {
        return this.items.length === 0
    }

    /**
     * Retrieves the size of this queue.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {number} The length.
     */
    size() {
        return this.items.length
    }

}

// QUEUE CLASS EXTRA CHALLENGE
class QueueNode {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedQueue {
    constructor() {
        this.head = null;
        this.tail = null;
    }
    enqueue(data) {
        // create the node first
        let node1 = new QueueNode(data)
        // check if linkedqueue is empty
        if (this.head == null && this.tail === null) {
        }
        //
        this.head = node1
        this.tail = node1
    }

    dequeue() {

    }

    /**
 * QUEUE MUST BE RETURNED TO IT'S ORIGINAL STATE
 * You are only allowed to use built-in methods
 * Use a stack to help solve
 * 
 * @returns {boolean} The queue is a palindrome
 */
    isPalindrome() {
        let flag = true;
        let thisStack = new Stack;
        for (let i = 0; i < this.size(); i++) {
            let nextUp = this.dequeue();
            thisStack.push(nextUp);
            this.enqueue(nextUp);
        }
        for (let i = 0; i < this.size(); i++) {
            let nextUp = this.dequeue();
            let stackNextUp = thisStack.pop()
            this.enqueue(nextUp);
            if (nextUp != stackNextUp) {
                flag = false;
            }
        }
        return flag;
    }

    /**
     * Determines whether the sum of the left half of the queue items is equal to
     * the sum of the right half. Avoid indexing the queue items directly via
     * bracket notation, use the queue methods instead for practice.
     * Use no extra array or objects.
     * The queue should be returned to it's original order when done.
     * - Time: O(?).
     * - Space: O(?).
     * @returns {boolean} Whether the sum of the left and right halves is equal.
     */
    isSumOfHalvesEqual() {

    }


}



let test = new Queue()
test.enqueue('a')
test.enqueue('b')
test.enqueue('c')
test.enqueue('b')
test.enqueue('a')
console.log(test.isPalindrome()) // true 


var q1 = Queue()

q1.enqueue(1)
q1.enqueue(2)
q1.enqueue(3)
q1.enqueue(3)
q1.enqueue(2)
q1.enqueue(1)

q1.isSumOfHalvesEqual() // true


var q2 = Queue()

q2.enqueue(5)
q2.enqueue(2)
q2.enqueue(1)
q2.enqueue(1)

q2.isSumOfHalvesEqual() // false