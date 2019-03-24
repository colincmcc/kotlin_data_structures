package main.datastructures.kotlin

// O(1)
// same time or space, regardless of size of the input
fun isFirstElementNull(list: List<String?>) = list[0]==null

// O(n)
//  performance grows linearly to the size of the input

fun containsValue(list: List<String>, value: String): Boolean {
    list.forEach { it ->
        if (it == value) return true
    }
    return false
}

// Counting Sort
// Integer sorting algorithm
fun countingSort(list: MutableList<Int>?){

}