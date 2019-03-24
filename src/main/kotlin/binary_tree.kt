package main.kotlin

import java.utils.*
fun main(){
    var rootNode = createBinaryTree()

}

fun <T> traverseInOrder(node: Node<T>?, list: MutableList<T>){
    if(node != null){
        traverseInOrder(node.leftNode, list)
        list.add(node.value)
        traverseInOrder(node.rightNode, list)
    }
}

fun <T> traversePostOrder(node: Node<T>??, list: MutableList<T>){
    if(node != null){
        traverseInOrder(node.leftNode, list)
        traverseInOrder(node.rightNode, list)
        list.add(node.value)
    }
}

fun <T> traversePreOrder(node: Node<T>?, list: MutableList<T>){
    if(node != null){
        list.add(node.value)
        traverseInOrder(node.leftNode, list)
        traverseInOrder(node.rightNode, list)
    }
}

fun <T> breadthFirstTraversal(rootNode: Node<T>){
    val queue = LinkedList<T>()

}

fun <T> depththFirstTraversal(rootNode: Node<T>){}





fun createBinaryTree(): Node<Char> {
    val a = Node('a', null, null)
    val b = Node('b', null, null)
    val c = Node('c', null, null)
    val d = Node('d', null, null)
    val e = Node('e', null, null)
    val f = Node('f', null, null)
    val g = Node('g', null, null)
    val h = Node('h', null, null)
    val i = Node('i', null, null)

    a.link(b,c)
    b.link(d,e)
    c.link(f,g)
    g.link(h,i)

    return a
}

data class Node<T>(
    val value: T,
    var leftNode: Node<T>?,
    var rightNode: Node<T>?,
    var depth: Int = 0
) {
    fun link(left: Node<T>?, right: Node<T>?) = this.apply {
        linkLeft(left).linkRight(right)
    }

    fun linkLeft(left: Node<T>?) = this.apply { leftNode = left }

    fun linkRight(right: Node<T>?) = this.apply { rightNode = right }

}