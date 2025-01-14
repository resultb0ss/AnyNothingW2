import java.util.Collections.swap

fun main() {
    val array = intArrayOf(1, 2, 3)


    println(array.toMutableList().permutations())

}

fun <V> MutableList<V>.permutations(): List<List<V>> {
    val result: MutableList<List<V>> = mutableListOf()

    fun generate(k: Int, list: MutableList<V>){
        if (k == 1) {
            result.add(list)
        }else {
            for (i in 0 until k){
                generate(k - 1, list)
                if (k%2 == 0){
                    swap(list, i, k-1)
                } else {
                    swap(list,0,k -1)
                }
            }
        }
    }
    generate(this.count(), this)
    return result
}